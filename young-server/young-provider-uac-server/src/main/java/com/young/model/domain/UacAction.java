package com.young.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 11:09
 * @UpdateUser:
 * @UpdateDate:2019/5/15 11:09
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "pc_uac_action")
@Alias(value = "uacAction")
public class UacAction extends BaseEntity implements Serializable {
    /**
     * 资源路径
     */
    private String url;

    /**
     * 权限名称
     */
    @Column(name = "action_name")
    private String actionName;

    /**
     * 权限编码
     */
    @Column(name = "action_code")
    private String actionCode;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 菜单ID
     */
    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 菜单ID
     */
    @Transient
    private List<Long> menuIdList;
}