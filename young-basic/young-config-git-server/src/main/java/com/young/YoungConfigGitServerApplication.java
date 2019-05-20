package com.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *Copyright (C), 2018-${YEAR}, 湖南金峰信息科技有限公司
 * @Description:
 * @Author: ZENGLING
 * @钉钉: 17363645521
 * @CreateDate: 2019/5/16 10:22
 * @UpdateUser:
 * @UpdateDate: 2019/5/16 10:22
 * @UpdateRemark:
 * @Version:
 */

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class YoungConfigGitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungConfigGitServerApplication.class, args);
    }

}
