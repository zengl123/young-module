package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:06
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:06
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class TokenMainQueryDto extends BaseQuery {
    private static final long serialVersionUID = -4003383211817581110L;
    private String loginName;

    private String userName;

    private Integer status;
}
