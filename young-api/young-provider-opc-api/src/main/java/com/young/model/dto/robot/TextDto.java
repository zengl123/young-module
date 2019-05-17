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
@ApiModel(value = "text类型")
public class TextDto implements Serializable {
    @ApiModelProperty(value = "消息内容", required = true)
    private String content;
}
