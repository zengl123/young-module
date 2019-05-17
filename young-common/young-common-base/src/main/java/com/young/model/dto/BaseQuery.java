package com.young.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:07
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:07
 * @UpdateRemark:
 * @Version:
 */
@Data
public class BaseQuery implements Serializable {
    /**
     * 当前页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 排序
     */
    private String orderBy;
}
