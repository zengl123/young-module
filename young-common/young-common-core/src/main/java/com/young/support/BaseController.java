package com.young.support;


import com.young.PublicUtil;
import com.young.constant.GlobalConstant;
import com.young.constant.WarpConstant;
import com.young.enums.ErrorCodeEnum;
import com.young.exception.BusinessException;
import com.young.model.dto.LoginAuthDto;
import com.young.thread.ThreadLocalMap;
import com.young.wrapper.WrapMapper;
import com.young.wrapper.Wrapper;


/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 11:18
 * @UpdateUser:
 * @UpdateDate:2019/5/14 11:18
 * @UpdateRemark:
 * @Version:
 */
public class BaseController {
    /**
     * Gets login auth dto.
     *
     * @return the login auth dto
     */
    protected LoginAuthDto getLoginAuthDto() {
        LoginAuthDto loginAuthDto = (LoginAuthDto) ThreadLocalMap.get(GlobalConstant.Sys.TOKEN_AUTH_DTO);
        if (PublicUtil.isEmpty(loginAuthDto)) {
            throw new BusinessException(ErrorCodeEnum.UAC10011041);
        }
        return loginAuthDto;
    }

    /**
     * Handle result wrapper.
     *
     * @param <T>    the type parameter
     * @param result the result
     *
     * @return the wrapper
     */
    protected <T> Wrapper<T> handleResult(T result) {
        boolean flag = isFlag(result);
        if (flag) {
            return WrapMapper.wrap(WarpConstant.SUCCESS_CODE, "操作成功", result);
        } else {
            return WrapMapper.wrap(WarpConstant.ERROR_CODE, "操作失败", result);
        }
    }

    /**
     * Handle result wrapper.
     *
     * @param <E>      the type parameter
     * @param result   the result
     * @param errorMsg the error msg
     *
     * @return the wrapper
     */
    protected <E> Wrapper<E> handleResult(E result, String errorMsg) {
        boolean flag = isFlag(result);
        if (flag) {
            return WrapMapper.wrap(WarpConstant.SUCCESS_CODE, "操作成功", result);
        } else {
            return WrapMapper.wrap(WarpConstant.ERROR_CODE, errorMsg, result);
        }
    }

    private boolean isFlag(Object result) {
        boolean flag;
        if (result instanceof Integer) {
            flag = (Integer) result > 0;
        } else if (result instanceof Boolean) {
            flag = (Boolean) result;
        } else {
            flag = PublicUtil.isNotEmpty(result);
        }
        return flag;
    }
}

