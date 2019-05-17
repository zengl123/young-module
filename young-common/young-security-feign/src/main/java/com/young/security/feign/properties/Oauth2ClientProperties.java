package com.young.security.feign.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 14:29
 * @UpdateUser:
 * @UpdateDate:2019/5/17 14:29
 * @UpdateRemark:
 * @Version:
 */
@Data
@ConfigurationProperties(prefix = "young.oauth2.client")
public class Oauth2ClientProperties {
    private String id;
    private String accessTokenUrl;
    private String clientId;
    private String clientSecret;
    private String clientAuthenticationScheme;
}
