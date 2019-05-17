package com.young.properties;

import lombok.Data;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 17:19
 * @UpdateUser:
 * @UpdateDate:2019/5/15 17:19
 * @UpdateRemark:
 * @Version:
 */
@Data
public class Oauth2Properties {
    /**
     * 使用jwt时为token签名的秘钥
     */
    private String jwtSigningKey = "young";
    /**
     * 客户端配置
     */
    private Oauth2ClientProperties[] clients = {};
}