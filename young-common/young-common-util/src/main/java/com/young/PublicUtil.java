package com.young;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 16:43
 * @UpdateUser:
 * @UpdateDate:2019/5/14 16:43
 * @UpdateRemark:
 * @Version:
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PublicUtil {
    /**
     * 匹配手机号码, 支持+86和86开头
     */
    private static final String REGX_MOBILE_NUM = "^((\\+86)|(86))?(13|15|17|18)\\d{9}$";
    /**
     * 匹配邮箱帐号
     */
    private static final String REGX_EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

    /**
     * 判断对象是否Empty(null或元素为0)
     * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
     *
     * @param pObj 待检查对象
     * @return boolean 返回的布尔值
     */
    public static boolean isEmpty(Object pObj) {
        if (pObj == null) {
            return true;
        }
        if (pObj == "") {
            return true;
        }
        if (pObj instanceof String) {
            return ((String) pObj).length() == 0;
        } else if (pObj instanceof Collection) {
            return ((Collection) pObj).isEmpty();
        } else if (pObj instanceof Map) {
            return ((Map) pObj).size() == 0;
        }
        return false;
    }

    /**
     * 判断对象是否为NotEmpty(!null或元素大于0)
     * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
     *
     * @param pObj 待检查对象
     * @return boolean 返回的布尔值
     */
    public static boolean isNotEmpty(Object pObj) {
        if (pObj == null) {
            return false;
        }
        if (pObj == "") {
            return false;
        }
        if (pObj instanceof String) {
            return ((String) pObj).length() != 0;
        } else if (pObj instanceof Collection) {
            return !((Collection) pObj).isEmpty();
        } else if (pObj instanceof Map) {
            return ((Map) pObj).size() != 0;
        }
        return true;
    }

    /**
     * 判断一个或多个对象是否为空
     *
     * @param values 可变参数, 要判断的一个或多个对象
     * @return 只有要判断的一个对象都为空则返回true, 否则返回false boolean
     */
    public static boolean isNull(Object... values) {
        if (!isEmpty(values)) {
            return true;
        }
        for (Object value : values) {
            boolean flag = isNotEmpty(value);
            if (flag) {
                return true;
            }
        }
        return false;
    }

    /**
     * Uuid string.
     *
     * @return the string
     */
    public synchronized static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 匹配手机号码（先支持13, 15, 17, 18开头的手机号码）.
     *
     * @param inputStr the input str
     * @return the boolean
     */
    public static Boolean isMobileNumber(String inputStr) {
        return StringUtils.isNotEmpty(inputStr) && inputStr.matches(REGX_MOBILE_NUM);
    }

    /**
     * Is email boolean.
     *
     * @param inputStr the inputStr
     * @return the boolean
     */
    public static boolean isEmail(String inputStr) {
        return StringUtils.isNotEmpty(inputStr) && inputStr.matches(REGX_EMAIL);
    }

}
