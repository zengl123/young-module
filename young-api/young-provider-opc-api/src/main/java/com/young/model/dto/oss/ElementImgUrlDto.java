package com.young.model.dto.oss;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:15
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:15
 * @UpdateRemark:
 * @Version:
 */
@Data
@AllArgsConstructor
public class ElementImgUrlDto implements Serializable {
    /**
     * 图片完整地址
     */
    private String url;
    /**
     * 图片名称
     */
    private String name;
    /**
     * 图片关联的附件ID
     */
    private Long attachmentId;
}
