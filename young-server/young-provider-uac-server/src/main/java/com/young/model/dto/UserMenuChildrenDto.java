package com.young.model.dto;

import com.young.model.vo.MenuVo;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:41
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:41
 * @UpdateRemark:
 * @Version:
 */
@Data
public class UserMenuChildrenDto implements Serializable {
    private static final long serialVersionUID = -6279523061450477189L;
    /**
     * 叶子节点菜单名称
     */
    private String leafMenuName;
    /**
     * 是否被选中,true
     */
    private boolean checked;
    /**
     * 跳转URL
     */
    private String url;
    /**
     * 叶子节点菜单Id
     */
    private Long leafMenuId;


    /**
     * Instantiates a new User menu children dto.
     *
     * @param menuVo the menu vo
     */
    public UserMenuChildrenDto(MenuVo menuVo) {
        this.leafMenuName = menuVo.getMenuName();
        this.url = menuVo.getUrl();
        this.leafMenuId = menuVo.getId();
    }
}
