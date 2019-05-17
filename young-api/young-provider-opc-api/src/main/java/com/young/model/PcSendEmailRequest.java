package com.young.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:20
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:20
 * @UpdateRemark:
 * @Version:
 */
@Data
public class PcSendEmailRequest implements Serializable {
    private String text;
    private String subject;
    private Set<String> to;
}