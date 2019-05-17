package com.young.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:00
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:00
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends BaseVo {
    /**
     * 角色编码
     */
    private String roleCode;

    private String roleName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}
