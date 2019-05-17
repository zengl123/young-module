package com.young.annotation;

import com.young.enums.LogTypeEnum;

import java.lang.annotation.*;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:自定义操作日志注解
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/10 17:45
 * @UpdateUser:
 * @UpdateDate:2019/5/10 17:45
 * @UpdateRemark:
 * @Version:
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    /**
     * 日志类型
     *
     * @return the log type enum
     */
    LogTypeEnum logType() default LogTypeEnum.OPERATION_LOG;

    /**
     * 是否保存请求的参数
     *
     * @return the boolean
     */
    boolean isSaveRequestData() default false;

    /**
     * 是否保存响应的结果
     *
     * @return the boolean
     */
    boolean isSaveResponseData() default false;
}
