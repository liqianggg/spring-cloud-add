package com.newnet.ad.utils;


import com.newnet.ad.exception.AdException;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.DigestUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * @Auth liqiang
 * @Date 18:55 2019/6/15
 * @DESCRIBLE
 * @JDK ${JDK}
 */
public class CommonUtil {

    private static final String[] parsePatterns={
            "yyyy-MM-dd","yyyy/MM/dd","yyyy.MM.dd"
    };

    public static String MD5(String value) {
        return DigestUtils.md5DigestAsHex(value.getBytes()).toLowerCase();
    }

    public static Date parseStringDate(String dateStr) throws AdException{
        try {
           return DateUtils.parseDate(dateStr,parsePatterns);
        } catch (ParseException e) {
            throw new AdException(e.getMessage());
        }
    }
}
