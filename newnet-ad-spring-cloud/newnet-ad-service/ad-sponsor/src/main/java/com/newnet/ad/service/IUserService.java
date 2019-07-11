package com.newnet.ad.service;

import com.newnet.ad.exception.AdException;
import com.newnet.ad.vo.CreateUserRequest;
import com.newnet.ad.vo.CreateUserResponse;

/**
 * @Auth liqiang
 * @Date 18:43 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public interface IUserService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest) throws AdException;
}
