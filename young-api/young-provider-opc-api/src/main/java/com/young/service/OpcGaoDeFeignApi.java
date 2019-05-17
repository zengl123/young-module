/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OpcGaodeFeignApi.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.young.service;


import com.young.model.dto.gaode.GaoDeLocation;
import com.young.security.feign.configuration.Oauth2FeignAutoConfiguration;
import com.young.service.hystrix.OpcGaoDeFeignApiHystrix;
import com.young.wrapper.Wrapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C), 2018-${YEAR}, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author: ZENGLING
 * @钉钉: 17363645521
 * @CreateDate: 2019/5/17 16:36
 * @UpdateUser:
 * @UpdateDate: 2019/5/17 16:36
 * @UpdateRemark:
 * @Version:
 */
@FeignClient(value = "young-provider-uac-server", configuration = Oauth2FeignAutoConfiguration.class, fallback = OpcGaoDeFeignApiHystrix.class)
public interface OpcGaoDeFeignApi {
    /**
     * IP定位.
     *
     * @param ipAddr the ip addr
     * @return the location by ip addr
     */
    @PostMapping(value = "/api/auth/getLocationByIpAddr")
    Wrapper<GaoDeLocation> getLocationByIpAddr(@RequestParam("ipAddr") String ipAddr);
}
