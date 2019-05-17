package com.young.model.dto;

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
 * @CreateDate:2019/5/17 15:11
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:11
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
public class GaoDeBaseDto implements Serializable {
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应信息")
    private String info;

    /**
     * 响应编码
     */
    @ApiModelProperty(value = "响应编码")
    private String infoCode;
}

