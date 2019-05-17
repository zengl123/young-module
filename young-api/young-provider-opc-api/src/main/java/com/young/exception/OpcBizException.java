package com.young.exception;

import com.young.enums.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:21
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:21
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
public class OpcBizException extends BusinessException {
    /**
     * Instantiates a new Uac rpc exception.
     */
    public OpcBizException() {
    }

    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param code      the code
     * @param msgFormat the msg format
     * @param args      the args
     */
    public OpcBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
        log.info("<== OpcBizException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param code the code
     * @param msg  the msg
     */
    public OpcBizException(int code, String msg) {
        super(code, msg);
        log.info("<== OpcBizException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Opc rpc exception.
     *
     * @param codeEnum the code enum
     */
    public OpcBizException(ErrorCodeEnum codeEnum) {
        super(codeEnum.code(), codeEnum.msg());
        log.info("<== OpcBizException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Opc rpc exception.
     *
     * @param codeEnum the code enum
     * @param args     the args
     */
    public OpcBizException(ErrorCodeEnum codeEnum, Object... args) {
        super(codeEnum, args);
        log.info("<== OpcBizException, code:{}, message:{}", this.code, super.getMessage());
    }
}
