package com.young.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/21 13:35
 * @UpdateUser:
 * @UpdateDate:2019/5/21 13:35
 * @UpdateRemark:
 * @Version:
 */
@RestController
public class Application {
    @ApolloConfig
    Config apolloConfig;

    @RequestMapping("/index")
    public HttpEntity getConfig() {
        String property = apolloConfig.getProperty("redis_host", "default");
        return new HttpEntity(property);
    }
}
