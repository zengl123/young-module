package com.young.exception;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:04
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:04
 * @UpdateRemark:
 * @Version:
 */
public class HttpProcessException extends Exception {

    public HttpProcessException(Exception e) {
        super(e);
    }

    public HttpProcessException(String msg) {
        super(msg);
    }

    public HttpProcessException(String message, Exception e) {
        super(message, e);
    }
}