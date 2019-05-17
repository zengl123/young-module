package com.young.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 17:17
 * @UpdateUser:
 * @UpdateDate:2019/5/15 17:17
 * @UpdateRemark:
 * @Version:
 */
@ConfigurationProperties(prefix = "young.security")
public class SecurityProperties {
    /**
     * 浏览器环境配置
     */
    private BrowserProperties browser = new BrowserProperties();
    /**
     * 验证码配置
     */
    private ValidateCodeProperties code = new ValidateCodeProperties();
    /**
     * 社交登录配置
     */
    private SocialProperties social = new SocialProperties();
    /**
     * OAuth2认证服务器配置
     */
    private Oauth2Properties oauth2 = new Oauth2Properties();

    /**
     * Gets browser.
     *
     * @return the browser
     */
    public BrowserProperties getBrowser() {
        return browser;
    }

    /**
     * Sets browser.
     *
     * @param browser the browser
     */
    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public ValidateCodeProperties getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

    /**
     * Gets social.
     *
     * @return the social
     */
    public SocialProperties getSocial() {
        return social;
    }

    /**
     * Sets social.
     *
     * @param social the social
     */
    public void setSocial(SocialProperties social) {
        this.social = social;
    }

    /**
     * Gets oauth 2.
     *
     * @return the oauth 2
     */
    public Oauth2Properties getOauth2() {
        return oauth2;
    }

    /**
     * Sets oauth 2.
     *
     * @param oauth2 the oauth 2
     */
    public void setOauth2(Oauth2Properties oauth2) {
        this.oauth2 = oauth2;
    }
}

