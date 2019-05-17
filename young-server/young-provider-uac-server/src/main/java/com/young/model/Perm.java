package com.young.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:35
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:35
 * @UpdateRemark:
 * @Version:
 */
@Data
public class Perm implements Serializable {
    private String resource;
    private String perm;
}
