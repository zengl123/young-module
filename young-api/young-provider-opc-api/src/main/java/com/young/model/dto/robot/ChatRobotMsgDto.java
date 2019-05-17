package com.young.model.dto.robot;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:26
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:26
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "自定义机器人消息体")
public class ChatRobotMsgDto implements Serializable {
    /**
     * 机器人URL
     */
    @ApiModelProperty(value = "机器人URL")
    private String webHookToken;

    /**
     * 此消息类型为固定markdown
     * {@link com.young.enums.RobotMsgTypeEnum}
     */
    @ApiModelProperty(value = "首屏会话透出的展示内容", required = true)
    @JsonProperty(value = "msg_type")
    private String msgType;
    @ApiModelProperty(value = "markdown消息体")
    private MarkdownDto markdown;
    @ApiModelProperty(value = "link类型")
    private LinkDto link;
    @ApiModelProperty(value = "text类型")
    private TextDto text;
    @ApiModelProperty(value = "link类型")
    private AtDto at;
}

