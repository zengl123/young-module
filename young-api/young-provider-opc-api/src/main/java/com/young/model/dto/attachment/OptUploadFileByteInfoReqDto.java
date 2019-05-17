package com.young.model.dto.attachment;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:09
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:09
 * @UpdateRemark:
 * @Version:
 */
@Data
public class OptUploadFileByteInfoReqDto implements Serializable {
    /**
     * 文件字节码
     */
    private byte[] fileByteArray;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件类型
     */
    private String fileType;
}
