package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:02
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:02
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "角色绑定用户")
public class RoleBindUserDto implements Serializable {
    /**
     * 未绑定的用户集合
     */
    @ApiModelProperty(value = "所有用户集合")
    private Set<BindUserDto> allUserSet;

    /**
     * 已经绑定的用户集合
     */
    @ApiModelProperty(value = "已经绑定的用户集合")
    private Set<Long> alreadyBindUserIdSet;
}
