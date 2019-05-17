package com.young.model.vo;

import lombok.Data;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 12:47
 * @UpdateUser:
 * @UpdateDate:2019/5/17 12:47
 * @UpdateRemark:
 * @Version:
 */
@Data
public class MenuCountVo {
    /**
     * 一级菜单id
     */
    private Long id;

    /**
     * 一级菜单名称
     */
    private String menuName;

    /**
     * 一级菜单下绑定子菜单个数
     */
    private int childNum;

    /**
     * Equals boolean.
     *
     * @param obj the obj
     * @return the boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof MenuCountVo) {
                MenuCountVo m = (MenuCountVo) obj;
                if (m.id.equals(this.id)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * Hash code int.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
