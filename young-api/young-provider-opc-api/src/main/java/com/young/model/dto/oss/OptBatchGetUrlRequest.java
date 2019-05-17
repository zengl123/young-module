package com.young.model.dto.oss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:22
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:22
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
@NoArgsConstructor
public class OptBatchGetUrlRequest {
    @ApiModelProperty(value = "文件流水号")
    private String refNo;
    @ApiModelProperty(value = "超时时间")
    private Long expires;
    @ApiModelProperty(value = "是否需要解密")
    private boolean encrypt;

    public OptBatchGetUrlRequest(String refNo) {
        this.refNo = refNo;
    }
}
