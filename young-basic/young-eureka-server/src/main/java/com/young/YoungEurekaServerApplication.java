package com.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *Copyright (C), 2018-${YEAR}, 湖南金峰信息科技有限公司
 * @Description:
 * @Author: ZENGLING
 * @钉钉: 17363645521
 * @CreateDate: 2019/5/16 9:53
 * @UpdateUser:
 * @UpdateDate: 2019/5/16 9:53
 * @UpdateRemark:
 * @Version:  
 */
@EnableEurekaServer
@SpringBootApplication
public class YoungEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungEurekaServerApplication.class, args);
    }

}
