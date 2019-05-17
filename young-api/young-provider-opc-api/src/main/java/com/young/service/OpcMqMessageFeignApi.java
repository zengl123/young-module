/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OpcMqMessageFeignApi.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.young.service;


import com.github.pagehelper.PageInfo;
import com.young.model.dto.MessageQueryDto;
import com.young.model.vo.MqMessageVo;
import com.young.security.feign.configuration.Oauth2FeignAutoConfiguration;
import com.young.service.hystrix.OpcMqMessageFeignApiHystrix;
import com.young.wrapper.Wrapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


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
@FeignClient(value = "young-provider-uac-server", configuration = Oauth2FeignAutoConfiguration.class, fallback = OpcMqMessageFeignApiHystrix.class)
public interface OpcMqMessageFeignApi {

    /**
     * Query waiting confirm message list wrapper.
     *
     * @param messageKeyList the message key list
     * @return the wrapper
     */
    @PostMapping(value = "/api/opc/message/queryMessageKeyList")
    Wrapper<List<String>> queryMessageKeyList(@RequestParam("messageKeyList") List<String> messageKeyList);

    /**
     * Query message list with page wrapper.
     *
     * @param messageQueryDto the message query dto
     * @return the wrapper
     */
    @PostMapping(value = "/api/opc/message/queryMessageListWithPage")
    Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(@RequestBody MessageQueryDto messageQueryDto);
}
