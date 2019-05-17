package com.young.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 16:11
 * @UpdateUser:
 * @UpdateDate:2019/5/17 16:11
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel
public class MessageQueryDto extends BaseQuery {
    @ApiModelProperty(value = "messageKey")
    private String messageKey;
    @ApiModelProperty(value = "messageTopic")
    private String messageTopic;
    @ApiModelProperty(value = "messageTag")
    private String messageTag;
    @ApiModelProperty(value = "发送状态")
    private String messageStatus;
    @ApiModelProperty(value = "PID")
    private String producerGroup;
    @ApiModelProperty(value = "消息类型")
    private String messageType;
    @ApiModelProperty(value = "开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startQueryTime;
    @ApiModelProperty(value = "结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endQueryTime;
}

