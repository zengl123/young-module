package com.young.mapper;

import com.young.model.domain.UacLog;
import com.young.model.dto.UacLogMainDto;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 13:40
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:40
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacLogMapper extends MyMapper<UacLog> {
    /**
     * Select user log list with user id list.
     *
     * @param userId the user id
     *
     * @return the list
     */
    List<UacLog> selectUserLogListByUserId(@Param("userId") Long userId);

    /**
     * Query log list with page list.
     *
     * @param uacLogQueryDtoPage the uac log query dto page
     *
     * @return the list
     */
    List<UacLog> queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage);
}