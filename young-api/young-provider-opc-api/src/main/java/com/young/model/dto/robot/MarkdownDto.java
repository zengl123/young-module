package com.young.model.dto.robot;

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
 * @CreateDate:2019/5/17 15:30
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:30
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "markdown类型")
public class MarkdownDto implements Serializable {
    @ApiModelProperty(value = "首屏会话透出的展示内容", required = true)
    private String title;
    @ApiModelProperty(value = "markdown格式的消息", required = true)
    private String text;
}
