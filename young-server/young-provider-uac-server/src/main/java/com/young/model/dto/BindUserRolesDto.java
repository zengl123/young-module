package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:39
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:39
 * @UpdateRemark:
 * @Version:
 */
@ApiModel
@Data
public class BindUserRolesDto implements Serializable {
    @ApiModelProperty(value = "角色ID")
    private Long userId;
    @ApiModelProperty(value = "需要绑定的角色ID集合")
    private List<Long> roleIdList;
}

