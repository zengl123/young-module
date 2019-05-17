package com.young.model.domain;

import com.young.model.dto.TpcMqMessageDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:52
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:52
 * @UpdateRemark:
 * @Version:
 */
@Table(name = "pc_mq_message_data")
@Data
@NoArgsConstructor
public class MqMessageData extends BaseEntity {
    /**
     * 消息key
     */
    @Column(name = "message_key")
    private String messageKey;

    /**
     * topic
     */
    @Column(name = "message_topic")
    private String messageTopic;

    /**
     * tag
     */
    @Column(name = "message_tag")
    private String messageTag;

    /**
     * 消息内容
     */
    @Column(name = "message_body")
    private String messageBody;

    /**
     * 消息类型: 10 - 生产者 ; 20 - 消费者
     */
    @Column(name = "message_type")
    private Integer messageType;

    /**
     * 顺序类型, 0有序 1无序
     */
    private int orderType;

    /**
     * 消息状态
     */
    private Integer status;

    /**
     * 延时级别
     */
    @Column(name = "delay_level")
    private int delayLevel;

    /**
     * 是否删除 -0 未删除 -1 已删除
     */
    private Integer yn;

    /**
     * producer group name
     */
    @Transient
    private String producerGroup;

    public MqMessageData(final String msgBody, final String topic, final String tag, final String key) {
        this.messageBody = msgBody;
        this.messageTopic = topic;
        this.messageTag = tag;
        this.messageKey = key;
    }

    /**
     * Gets tpc mq message dto.
     *
     * @return the tpc mq message dto
     */
    @Transient
    public TpcMqMessageDto getTpcMqMessageDto() {
        TpcMqMessageDto tpcMqMessageDto = new TpcMqMessageDto();
        tpcMqMessageDto.setMessageBody(this.messageBody);
        tpcMqMessageDto.setMessageKey(this.messageKey);
        tpcMqMessageDto.setMessageTag(this.messageTag);
        tpcMqMessageDto.setMessageTopic(this.messageTopic);
        tpcMqMessageDto.setMessageType(this.messageType);
        tpcMqMessageDto.setRefNo(this.messageKey);
        tpcMqMessageDto.setDelayLevel(this.delayLevel);
        tpcMqMessageDto.setOrderType(this.orderType);
        tpcMqMessageDto.setProducerGroup(this.producerGroup);
        return tpcMqMessageDto;
    }
}
