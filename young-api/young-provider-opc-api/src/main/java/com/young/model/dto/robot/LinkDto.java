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
 * @CreateDate:2019/5/17 15:29
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:29
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "link类型")
public class LinkDto implements Serializable {
    @ApiModelProperty(value = "消息标题", required = true)
    private String title;
    @ApiModelProperty(value = "消息内容,如果太长只会部分展示", required = true)
    private String text;
    @ApiModelProperty(value = "点击消息跳转的URL", required = true)
    private String messageUrl;
    @ApiModelProperty(value = "图片URL")
    private String picUrl;
}

