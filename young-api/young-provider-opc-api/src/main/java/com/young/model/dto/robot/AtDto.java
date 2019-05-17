package com.young.model.dto.robot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:26
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:26
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "AtDto")
public class AtDto implements Serializable {
    /**
     * 被@人的手机号
     */
    @ApiModelProperty(value = "被@人的手机号")
    private String[] atMobiles;
    /**
     * \@所有人时:true,否则为:false
     */
    @ApiModelProperty(value = "@所有人时:true,否则为:false")
    private boolean isAtAll;
}
