package com.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *Copyright (C), 2018-${YEAR}, 湖南金峰信息科技有限公司
 * @Description: 网管服务
 * @Author: ZENGLING
 * @钉钉: 17363645521
 * @CreateDate: 2019/5/16 14:48
 * @UpdateUser:
 * @UpdateDate: 2019/5/16 14:48
 * @UpdateRemark:
 * @Version:  
 */
@EnableEurekaClient
@SpringBootApplication
public class YoungGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungGatewayServerApplication.class, args);
    }

}
