package com.young.model.dto.oss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:23
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:23
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
public class OptGetUrlRequest {
    @ApiModelProperty(value = "附件ID")
    private Long attachmentId;
    @ApiModelProperty(value = "超时时间")
    private Long expires;
    @ApiModelProperty(value = "是否需要解密")
    private boolean encrypt;
    @ApiModelProperty(value = "附件ID集合")
    private List<Long> attachmentIdList;
}