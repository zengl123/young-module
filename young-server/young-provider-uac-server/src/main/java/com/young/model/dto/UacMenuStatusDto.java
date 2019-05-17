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
 * @CreateDate:2019/5/15 10:28
 * @UpdateUser:
 * @UpdateDate:2019/5/15 10:28
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "UacMenuStatusDto")
public class UacMenuStatusDto implements Serializable {
    @ApiModelProperty(value = "菜单的Id", required = true)
    private Long id;
    @ApiModelProperty(value = "菜单的状态", required = true)
    private String status;
}