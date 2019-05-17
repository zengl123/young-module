package com.young.exception;

import com.young.enums.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/11 10:54
 * @UpdateUser:
 * @UpdateDate:2019/5/11 10:54
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
public class UacBizException extends BusinessException {
    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param code      the code
     * @param msgFormat the msg format
     * @param args      the args
     */
    public UacBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
        log.info("<== UacRpcException, code:{} , message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param code the code
     * @param msg  the msg
     */
    public UacBizException(int code, String msg) {
        super(code, msg);
        log.info("<== UacRpcException, code:{} , message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param codeEnum the code enum
     */
    public UacBizException(ErrorCodeEnum codeEnum) {
        super(codeEnum.code(), codeEnum.msg());
        log.info("<== UacRpcException, code:{} , message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new Uac rpc exception.
     *
     * @param codeEnum the code enum
     * @param args     the args
     */
    public UacBizException(ErrorCodeEnum codeEnum, Object... args) {
        super(codeEnum, args);
        log.info("<== UacRpcException, code:{} , message:{}", this.code, super.getMessage());
    }
}
