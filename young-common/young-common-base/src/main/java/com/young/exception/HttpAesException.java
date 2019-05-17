package com.young.exception;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/11 10:21
 * @UpdateUser:
 * @UpdateDate:2019/5/11 10:21
 * @UpdateRemark:
 * @Version:
 */
public class HttpAesException extends IllegalArgumentException {
    /**
     * Instantiates a new Http aes exception.
     *
     * @param message the message
     */
    public HttpAesException(String message) {
        super(message);
    }
}