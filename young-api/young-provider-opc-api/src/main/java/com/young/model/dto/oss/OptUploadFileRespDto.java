package com.young.model.dto.oss;

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
 * @CreateDate:2019/5/17 15:24
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:24
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "OptUploadFileReqDto")
public class OptUploadFileRespDto implements Serializable {
    @ApiModelProperty(value = "附件ID")
    private Long attachmentId;
    @ApiModelProperty(value = "文件完整url")
    private String attachmentUrl;
    @ApiModelProperty(value = "文件名")
    private String attachmentName;
    @ApiModelProperty(value = "文件路径(等于七牛文件名)")
    private String attachmentPath;
    @ApiModelProperty(value = "文件类型")
    private String fileType;
    @ApiModelProperty(value = "关联业务单号")
    private String refNo;
}

