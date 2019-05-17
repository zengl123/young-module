package com.young.security;

import com.young.PublicUtil;
import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 16:36
 * @UpdateUser:
 * @UpdateDate:2019/5/15 16:36
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
public class AesUtil {
    private static final String CHAR_SET = "UTF-8";
    private static final String PADDING = "AES/CBC/ISO10126Padding";


    public static String encrypt(String contentParam, String keyParam, String ivParam) {
        return encrypt(contentParam, keyParam, ivParam, CHAR_SET, PADDING);
    }

    public static String decrypt(String contentParam, String keyParam, String ivParam) {
        return encrypt(contentParam, keyParam, ivParam, CHAR_SET, PADDING);
    }

    /**
     * 加密
     *
     * @param contentParam 需要加密的内容
     * @param keyParam     加密密码
     * @param ivParam      加密向量
     * @return 加密后的字节数据 string
     */
    public static String encrypt(String contentParam, String keyParam, String ivParam, String charsetName, String padding) {
        try {
            byte[] content = contentParam.getBytes(charsetName);
            byte[] key = keyParam.getBytes(charsetName);
            byte[] iv = ivParam.getBytes(charsetName);
            SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
            //"算法/模式/补码方式"
            Cipher cipher = Cipher.getInstance(padding);
            //使用CBC模式, 需要一个向量iv, 可增加加密算法的强度
            IvParameterSpec ivps = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivps);
            byte[] bytes = cipher.doFinal(content);
            return new BASE64Encoder().encode(bytes);
        } catch (Exception ex) {
            log.error("加密密码失败", ex);
            throw new SecurityException("加密失败");
        }
    }

    /**
     * 解密
     *
     * @param contentParam 需要解密的内容
     * @param keyParam     加密密码
     * @param ivParam      加密向量
     * @return string
     */
    public static String decrypt(String contentParam, String keyParam, String ivParam, String charsetName, String padding) {
        try {
            if (PublicUtil.isNull(contentParam, keyParam, ivParam, charsetName, padding)) {
                return "";
            }
            byte[] content = new BASE64Decoder().decodeBuffer(contentParam);
            byte[] key = keyParam.getBytes(charsetName);
            byte[] iv = ivParam.getBytes(charsetName);
            SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
            //"算法/模式/补码方式"
            Cipher cipher = Cipher.getInstance(padding);
            //使用CBC模式, 需要一个向量iv, 可增加加密算法的强度
            IvParameterSpec ivps = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivps);
            byte[] bytes = cipher.doFinal(content);
            return new String(bytes, CHAR_SET);
        } catch (Exception ex) {
            log.error("解密密码失败", ex);
            throw new SecurityException("解密失败");
        }
    }
}
