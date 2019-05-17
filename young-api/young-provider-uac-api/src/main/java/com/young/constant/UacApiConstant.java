package com.young.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/11 10:36
 * @UpdateUser:
 * @UpdateDate:2019/5/11 10:36
 * @UpdateRemark:
 * @Version:
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UacApiConstant {
    /**
     * token变量
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class Valid {
        /**
         * The constant EMAIL.
         */
        public static final String EMAIL = "email";
        /**
         * The constant LOGIN_NAME.
         */
        public static final String LOGIN_NAME = "loginName";
        /**
         * The constant MOBILE_NO.
         */
        public static final String MOBILE_NO = "mobileNo";
    }
}