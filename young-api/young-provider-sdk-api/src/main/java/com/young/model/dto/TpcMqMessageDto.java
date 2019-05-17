package com.young.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:55
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:55
 * @UpdateRemark:
 * @Version:
 */
@Data
public class TpcMqMessageDto implements Serializable {
    /**
     * 生产者组
     */
    private String producerGroup;

    /**
     * 业务单据号
     */
    private String refNo;

    /**
     * 消息key
     */
    private String messageKey;

    /**
     * topic
     */
    private String messageTopic;

    /**
     * tag
     */
    private String messageTag;

    /**
     * 消息类型
     */
    private Integer messageType;

    /**
     * 消息内容
     */
    private String messageBody;

    /**
     * 延时消息的延时级别
     */
    private int delayLevel;

    /**
     * 顺序类型, 0有序 1无序
     */
    private int orderType;
}