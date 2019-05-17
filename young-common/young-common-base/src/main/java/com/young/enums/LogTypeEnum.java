package com.young.enums;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/10 17:47
 * @UpdateUser:
 * @UpdateDate:2019/5/10 17:47
 * @UpdateRemark:
 * @Version:
 */
public enum LogTypeEnum {
    /**
     * 操作日志
     */
    OPERATION_LOG("10", "操作日志"),
    /**
     * 登录日志
     */
    LOGIN_LOG("20", "登录日志"),
    /**
     * 异常日志
     */
    EXCEPTION_LOG("30", "异常日志");

    /**
     * 日志类型
     */
    String type;
    /**
     * 日志名称
     */
    String name;

    LogTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets name.
     *
     * @param type the type
     * @return the name
     */
    public static String getName(String type) {
        for (LogTypeEnum ele : LogTypeEnum.values()) {
            if (type.equals(ele.getType())) {
                return ele.getName();
            }
        }
        return null;
    }

    /**
     * Gets enum.
     *
     * @param type the type
     * @return the enum
     */
    public static LogTypeEnum getEnum(String type) {
        for (LogTypeEnum ele : LogTypeEnum.values()) {
            if (type.equals(ele.getType())) {
                return ele;
            }
        }
        return LogTypeEnum.OPERATION_LOG;
    }

    /**
     * Gets list.
     *
     * @return the list
     */
    public static List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = Lists.newArrayList();
        for (LogTypeEnum ele : LogTypeEnum.values()) {
            Map<String, Object> map = Maps.newHashMap();
            map.put("key", ele.getType());
            map.put("value", ele.getName());
            list.add(map);
        }
        return list;
    }
}
