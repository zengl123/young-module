package com.young.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:59
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:59
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "pc_uac_role")
@Alias(value = "uacRole")
public class UacRole extends BaseEntity implements Serializable {

    /**
     * 角色编码
     */
    @Column(name = "role_code")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "{role.roleCode.pattern}")
    @Length(min = 6, max = 20, message = "{role.roleCode.length}")
    private String roleCode;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    @Pattern(regexp = "^[\\u4e00-\\u9faf]+$", message = "{role.roleName.pattern}")
    @Length(min = 4, max = 10, message = "{role.roleName.length}")
    private String roleName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    @Length(max = 150, message = "{role.remark.length}")
    private String remark;

}
