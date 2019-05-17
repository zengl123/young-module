package com.young.annotation;

import com.young.enums.DelayLevelEnum;
import com.young.enums.MqOrderTypeEnum;
import com.young.enums.MqSendTypeEnum;

import java.lang.annotation.*;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:保存生产者消息
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:29
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:29
 * @UpdateRemark:
 * @Version:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MqProducerStore {
    MqSendTypeEnum sendType() default MqSendTypeEnum.WAIT_CONFIRM;

    MqOrderTypeEnum orderType() default MqOrderTypeEnum.ORDER;

    DelayLevelEnum delayLevel() default DelayLevelEnum.ZERO;
}

