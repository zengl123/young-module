package com.young.security.feign.configuration;

import com.young.interceptor.Oauth2FeignErrorInterceptor;
import com.young.interceptor.Oauth2FeignRequestInterceptor;
import com.young.security.feign.properties.Oauth2ClientProperties;
import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.Netty4ClientHttpRequestFactory;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 14:33
 * @UpdateUser:
 * @UpdateDate:2019/5/17 14:33
 * @UpdateRemark:
 * @Version:
 */
@Configuration
@EnableConfigurationProperties(Oauth2ClientProperties.class)
public class Oauth2FeignAutoConfiguration {

    private final Oauth2ClientProperties oauth2ClientProperties;

    /**
     * Instantiates a new O auth 2 feign auto configuration.
     *
     * @param oauth2ClientProperties the oauth 2 client properties
     */
    @Autowired
    public Oauth2FeignAutoConfiguration(Oauth2ClientProperties oauth2ClientProperties) {
        this.oauth2ClientProperties = oauth2ClientProperties;
    }

    /**
     * Resource details client credentials resource details.
     *
     * @return the client credentials resource details
     */
    @Bean("youngClientCredentialsResourceDetails")
    public ClientCredentialsResourceDetails resourceDetails() {
        ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
        details.setId(oauth2ClientProperties.getId());
        details.setAccessTokenUri(oauth2ClientProperties.getAccessTokenUrl());
        details.setClientId(oauth2ClientProperties.getClientId());
        details.setClientSecret(oauth2ClientProperties.getClientSecret());
        details.setAuthenticationScheme(AuthenticationScheme.valueOf(oauth2ClientProperties.getClientAuthenticationScheme()));
        return details;
    }

    /**
     * O auth 2 rest template o auth 2 rest template.
     *
     * @return the o auth 2 rest template
     */
    @Bean("youngOAuth2RestTemplate")
    public OAuth2RestTemplate oAuth2RestTemplate() {
        final OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(resourceDetails(), new DefaultOAuth2ClientContext());
        oAuth2RestTemplate.setRequestFactory(new Netty4ClientHttpRequestFactory());
        return oAuth2RestTemplate;

    }

    /**
     * Oauth 2 feign request interceptor request interceptor.
     *
     * @param oAuth2RestTemplate the o auth 2 rest template
     *
     * @return the request interceptor
     */
    @Bean
    public RequestInterceptor oauth2FeignRequestInterceptor(@Qualifier("youngOAuth2RestTemplate") OAuth2RestTemplate oAuth2RestTemplate) {
        return new Oauth2FeignRequestInterceptor(oAuth2RestTemplate);
    }

    /**
     * Feign logger level logger . level.
     *
     * @return the logger . level
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


    @Bean
    public ErrorDecoder errorDecoder() {
        return new Oauth2FeignErrorInterceptor();
    }
}