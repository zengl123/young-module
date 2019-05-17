package com.young.service;

import com.github.pagehelper.PageInfo;
import com.young.model.domain.UacLog;
import com.young.model.dto.LoginAuthDto;
import com.young.model.dto.OperationLogDto;
import com.young.model.dto.UacLogMainDto;
import com.young.support.IService;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:55
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:55
 * @UpdateRemark:
 * @Version:
 */
public interface IUacLogService extends IService<UacLog> {

    /**
     * Save log int.
     *
     * @param uacLog       the uac log
     * @param loginAuthDto the login auth dto
     *
     * @return the int
     */
    int saveLog(UacLog uacLog, LoginAuthDto loginAuthDto);

    /**
     * Query user log list with user id list.
     *
     * @param userId the user id
     *
     * @return the list
     */
    List<UacLog> selectUserLogListByUserId(Long userId);

    /**
     * Save operation log integer.
     *
     * @param operationLogDto the operation log dto
     *
     * @return the integer
     */
    Integer saveOperationLog(OperationLogDto operationLogDto);

    /**
     * Query log list with page wrapper.
     *
     * @param uacLogQueryDtoPage the uac log query dto page
     *
     * @return the wrapper
     */
    PageInfo queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage);
}

