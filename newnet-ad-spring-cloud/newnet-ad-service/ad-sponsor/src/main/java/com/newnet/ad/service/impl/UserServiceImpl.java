package com.newnet.ad.service.impl;

import com.newnet.ad.constant.Constants;
import com.newnet.ad.dao.AdUserRepository;
import com.newnet.ad.entity.AdUser;
import com.newnet.ad.exception.AdException;
import com.newnet.ad.service.IUserService;
import com.newnet.ad.utils.CommonUtil;
import com.newnet.ad.vo.CreateUserRequest;
import com.newnet.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auth liqiang
 * @Date 18:48 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private AdUserRepository adUserRepository;

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws AdException {
        if (!createUserRequest.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser adUser = adUserRepository.findByUsername(createUserRequest.getUserName());
        if (null != adUser) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
        final AdUser save = adUserRepository.save(new AdUser(createUserRequest.getUserName(), CommonUtil.MD5(createUserRequest.getUserName())));
        return new CreateUserResponse(save.getId(), save.getUsername(),
                save.getToken(), save.getCreateTime(), save.getUpdateTime());
    }
}
