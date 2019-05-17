package com.young.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:35
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:35
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
public class BindAuthVo {
    /**
     * 包含按钮权限和菜单权限
     */
    private List<MenuVo> authTree;
    /**
     * 该角色含有的权限ID
     */
    private List<Long> checkedAuthList;
}