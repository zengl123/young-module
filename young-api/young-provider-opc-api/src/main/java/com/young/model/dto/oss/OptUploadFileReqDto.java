package com.young.model.dto.oss;

import com.young.model.dto.attachment.OptUploadFileByteInfoReqDto;
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
 * @CreateDate:2019/5/17 15:23
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:23
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "OptUploadFileReqDto")
public class OptUploadFileReqDto implements Serializable {
    @ApiModelProperty(value = "文件类型")
    private String fileType;
    @ApiModelProperty(value = "文件路径")
    private String filePath;
    @ApiModelProperty(value = "文件服务器根目录")
    private String bucketName;
    @ApiModelProperty(value = "用户ID")
    private Long userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
    private OptUploadFileByteInfoReqDto uploadFileByteInfoReqDto;
}
