package com.young.model.dto.gaode;

import com.young.model.dto.GaoDeBaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 15:10
 * @UpdateUser:
 * @UpdateDate:2019/5/17 15:10
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GaoDeLocation extends GaoDeBaseDto {
    private String province;
    private String city;
    private String adCode;
    private String rectangle;
}

