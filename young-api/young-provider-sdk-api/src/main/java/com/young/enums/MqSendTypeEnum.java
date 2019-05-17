package com.young.enums;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:30
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:30
 * @UpdateRemark:
 * @Version:
 */
public enum MqSendTypeEnum {
    /**
     * 等待确认.
     */
    WAIT_CONFIRM,

    /**
     * 直接发送.
     */
    SAVE_AND_SEND,

    /**
     * 直接发送
     */
    //TODO 消费切口 有问题, 日后修复 暂时不可用
    @Deprecated
    DIRECT_SEND
}

