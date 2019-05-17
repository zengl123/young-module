package com.young.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 10:22
 * @UpdateUser:
 * @UpdateDate:2019/5/15 10:22
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel
public class ViewMenuVo extends BaseVo {

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 状态
     */
    private String status;

    /**
     * 菜单URL
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 上级菜单名称
     */
    private String parentMenuName;

    /**
     * 层级(最多三级1,2,3)
     */
    private Integer level;

    /**
     * 是否叶子节点,1不是0是
     */
    private Integer leaf;

    /**
     * 序号
     */
    private Integer number;

    /**
     * 备注
     */
    private String remark;
    /**
     * 系统ID
     */
    private Long applicationId;
}