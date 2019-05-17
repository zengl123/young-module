package com.young.security;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.MessageDigest;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 11:45
 * @UpdateUser:
 * @UpdateDate:2019/5/15 11:45
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Md5Util {
    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static String encodingCharset = "UTF-8";

    /**
     * Encrypt string.
     *
     * @param password 密码
     * @return the string
     */
    public static String encrypt(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    /**
     * 密码是否匹配.
     *
     * @param rawPassword     明文
     * @param encodedPassword 密文
     * @return the boolean
     */
    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
        return new BCryptPasswordEncoder().matches(rawPassword, encodedPassword);
    }


    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     * MD5加密
     *
     * @param origin
     * @param charsetName
     * @return
     */
    public static String Md5Encode(String origin, String charsetName) {
        String resultString;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetName == null || "".equals(charsetName)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetName)));
            }
        } catch (Exception exception) {
            resultString = "";
            log.error("Md5加密异常:{}", exception);
        }
        return resultString;
    }

    /**
     * 普通Md5加密
     *
     * @param origin
     * @return
     */
    public static String Md5Encode(String origin) {
        return Md5Encode(origin, encodingCharset);
    }
}
