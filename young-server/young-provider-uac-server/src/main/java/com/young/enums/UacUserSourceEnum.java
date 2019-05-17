package com.young.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:50
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:50
 * @UpdateRemark:
 * @Version:
 */
public enum UacUserSourceEnum {
    /**
     * 注册
     */
    REGISTER("REGISTER", "注册"),

    /**
     * 后台新增
     */
    INSERT("INSERT", "后台新增"),

    /**
     * 后台导入
     */
    IMPORT("IMPORT", "后台导入"),

    /**
     * 手机
     */
    APP("APP", "手机"),
    ;

    /**
     * The Key.
     */
    String key;

    /**
     * The Value.
     */
    String value;

    UacUserSourceEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取key获取value
     *
     * @param key key
     * @return value value
     */
    public static String getValue(String key) {
        for (UacUserSourceEnum ele : UacUserSourceEnum.values()) {
            if (key.equals(ele.getKey())) {
                return ele.getValue();
            }
        }
        return null;
    }

    /**
     * 根据key获取该对象
     *
     * @param key key
     * @return this enum
     */
    public static UacUserSourceEnum getEnum(String key) {
        for (UacUserSourceEnum ele : UacUserSourceEnum.values()) {
            if (key.equals(ele.getKey())) {
                return ele;
            }
        }
        return null;
    }

    /**
     * 获取List集合
     *
     * @return List list
     */
    public static List<UacUserSourceEnum> getList() {
        return Arrays.asList(UacUserSourceEnum.values());
    }
}
