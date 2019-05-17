package com.young.enums;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:31
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:31
 * @UpdateRemark:
 * @Version:
 */
public enum MqOrderTypeEnum {
    /**
     * 有序.
     */
    ORDER(1),
    /**
     * 无序.
     */
    DIS_ORDER(0);

    /**
     * The Order type.
     */
    int orderType;

    MqOrderTypeEnum(final int orderType) {
        this.orderType = orderType;
    }

    /**
     * Order type int.
     *
     * @return the int
     */
    public int orderType() {
        return orderType;
    }
}

