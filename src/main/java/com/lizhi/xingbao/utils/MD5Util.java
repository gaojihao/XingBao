package com.lizhi.xingbao.utils;

import org.springframework.util.DigestUtils;

public class MD5Util {

    private static final String SLAT = "&%5123***&&%%$$#@";

    public static String getMD5(String str) {
        String base = str +"/"+SLAT;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
