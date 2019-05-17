package com.young.enums;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:支付类型枚举
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/11 10:15
 * @UpdateUser:
 * @UpdateDate:2019/5/11 10:15
 * @UpdateRemark:
 * @Version:
 */
public enum PaymentTypeEnum {
    /**
     * 在线支付
     */
    ONLINE_PAY(1, "在线支付");

    PaymentTypeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    private String value;
    private int code;

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Code of payment type enum.
     *
     * @param code the code
     * @return the payment type enum
     */
    public static PaymentTypeEnum codeOf(int code) {
        for (PaymentTypeEnum paymentTypeEnum : values()) {
            if (paymentTypeEnum.getCode() == code) {
                return paymentTypeEnum;
            }
        }
        return null;
    }
}