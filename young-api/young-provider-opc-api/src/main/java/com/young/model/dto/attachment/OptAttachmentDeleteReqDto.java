package com.young.model.dto.attachment;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:06
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:06
 * @UpdateRemark:
 * @Version:
 */
@Data
public class OptAttachmentDeleteReqDto implements Serializable {
    private String[] serialNos;
}