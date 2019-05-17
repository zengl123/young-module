package com.young.model.dto.attachment;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:08
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:08
 * @UpdateRemark:
 * @Version:
 */
@Data
public class OptAttachmentRespDto implements Serializable {
    private Long id;
    private String serialNo;
    private String refNo;
    private String name;
    private String path;
    private String type;
    private String format;
    private String description;
    /**
     * 文件服务器根目录
     */
    private String bucketName;

}
