/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OpcOssFeignApi.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.young.service;

import com.young.model.dto.oss.*;
import com.young.security.feign.configuration.Oauth2FeignAutoConfiguration;
import com.young.service.hystrix.OpcOssFeignApiHystrix;
import com.young.wrapper.Wrapper;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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
@FeignClient(value = "young-provider-uac-server", configuration = Oauth2FeignAutoConfiguration.class, fallback = OpcOssFeignApiHystrix.class)
public interface OpcOssFeignApi {
    /**
     * 上传文件.
     *
     * @param optUploadFileReqDto the opt upload file req dto
     * @return the wrapper
     */
    @PostMapping(value = "/api/opc/oss/uploadFile")
    Wrapper<OptUploadFileRespDto> uploadFile(@RequestBody OptUploadFileReqDto optUploadFileReqDto);

    /**
     * 获取附件完整路径.
     *
     * @param optGetUrlRequest the opt get url request
     * @return the file url
     */
    @PostMapping(value = "/api/opc/oss/getFileUrl")
    Wrapper<String> getFileUrl(@RequestBody OptGetUrlRequest optGetUrlRequest);

    /**
     * List file url wrapper.
     *
     * @param urlRequest the url request
     * @return the wrapper
     */
    @PostMapping(value = "/api/opc/oss/listFileUrl")
    Wrapper<List<ElementImgUrlDto>> listFileUrl(@RequestBody OptBatchGetUrlRequest urlRequest);

    /**
     * Upload file with feign wrapper.
     *
     * @param file the file
     * @return the wrapper
     */
    @PostMapping(value = "/api/opc/oss/handleFileUpload")
    Wrapper<OptUploadFileRespDto> handleFileUpload(@RequestPart(value = "file") MultipartFile file);

    /**
     * 删除过期的文件.
     */
    @PostMapping(value = "/api/opc/oss/deleteExpireFile")
    void deleteExpireFile();

    /**
     * The class Multipart support config.
     *
     * @author paascloud.net @gmail.com
     */
    class MultipartSupportConfig {
        /**
         * Feign form encoder encoder.
         *
         * @return the encoder
         */
        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }
}
