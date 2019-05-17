package com.young.properties;

import com.young.enums.LoginResponseType;
import lombok.Data;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 17:18
 * @UpdateUser:
 * @UpdateDate:2019/5/15 17:18
 * @UpdateRemark:
 * @Version:
 */
@Data
public class BrowserProperties {
    /**
     * session管理配置项
     */
    private SessionProperties session = new SessionProperties();
    /**
     * '记住我'功能的有效时间，默认1小时
     */
    private int rememberMeSeconds = 3600;
    /**
     * 社交登录，如果需要用户注册，跳转的页面
     */
    private String signUpUrl = "/pc-signUp.html";
    /**
     * 登录响应的方式，默认是json
     */
    private LoginResponseType signInResponseType = LoginResponseType.JSON;
    /**
     * 登录成功后跳转的地址，如果设置了此属性，则登录成功后总是会跳到这个地址上。
     * 只在signInResponseType为REDIRECT时生效
     */
    private String singInSuccessUrl;
}
