package com.young.model.dto;

import com.young.model.vo.MenuVo;
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
 * @CreateDate:2019/5/14 17:21
 * @UpdateUser:
 * @UpdateDate:2019/5/14 17:21
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "发送短信参数Dto")
public class LoginRespDto implements Serializable {
    private static final long serialVersionUID = -8992761897550131632L;
    @ApiModelProperty(value = "登陆信息")
    private LoginAuthDto loginAuthDto;
    @ApiModelProperty(value = "菜单集合")
    private List<MenuVo> menuList;
}