package com.young.enums;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:32
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:32
 * @UpdateRemark:
 * @Version:
 */
public enum RobotMsgTypeEnum {
    /**
     * 操作日志
     */
    MARKDOWN("markdown", "markdown"),
    /**
     * Link robot msg type enum.
     */
    LINK("link", "link"),
    /**
     * Text robot msg type enum.
     */
    TEXT("text", "text"),;

    /**
     * The Type.
     */
    String type;
    /**
     * The Name.
     */
    String name;

    RobotMsgTypeEnum(String type, String name) {
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
     *
     * @return the name
     */
    public static String getName(String type) {
        for (RobotMsgTypeEnum ele : RobotMsgTypeEnum.values()) {
            if (ele.getType().equals(type)) {
                return ele.getName();
            }
        }
        return null;
    }
}

