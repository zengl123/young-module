package com.young.mapper;

import com.young.model.domain.UacUserMenu;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:43
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:43
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacUserMenuMapper extends MyMapper<UacUserMenu> {
}
