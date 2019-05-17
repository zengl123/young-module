package com.young.model.vo;

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
 * @CreateDate:2019/5/11 11:07
 * @UpdateUser:
 * @UpdateDate:2019/5/11 11:07
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel("菜单")
public class MenuVo implements Serializable {
    /**
     * menu.id;
     */
    @ApiModelProperty("菜单编号")
    private Long id;

    /**
     * 父id
     */
    @ApiModelProperty("父id")
    private Long pid;

    /**
     * 菜单编码
     */
    @ApiModelProperty("菜单编码")
    private String menuCode;

    /**
     * 菜单名称
     */
    @ApiModelProperty("菜单名称")
    private String menuName;

    /**
     * 菜单URL
     */
    @ApiModelProperty("菜单URL")
    private String url;
    /**
     * 图标
     */
    @ApiModelProperty("图标")
    private String icon;

    /**
     * 序号
     */
    @ApiModelProperty("序号")
    private String number;

    /**
     * 备注(研发中心)
     */
    @ApiModelProperty("备注(研发中心)")
    private String remark;

    /**
     * 删除标识
     */
    @ApiModelProperty("删除标识")
    private Short yn;
    private MenuVo parentMenu;
    private List<MenuVo> subMenu;
    private boolean hasMenu = false;
}
