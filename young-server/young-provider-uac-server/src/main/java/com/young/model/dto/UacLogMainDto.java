package com.young.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:56
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:56
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel
public class UacLogMainDto extends BaseQuery {
    @ApiModelProperty(value = "日志类型")
    private String logType;
    @ApiModelProperty(value = "操作用户名称")
    private String creator;
    @ApiModelProperty(value = "权限名称")
    private String actionName;
    @ApiModelProperty(value = "权限编码")
    private String actionCode;
    @ApiModelProperty(value = "菜单ID集合")
    private List<Long> menuIdList;
    @ApiModelProperty(value = "菜单ID")
    private Long menuId;
    @ApiModelProperty(value = "开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startQueryTime;
    @ApiModelProperty(value = "结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endQueryTime;
    @ApiModelProperty(value = "登录IP")
    private String ip;
    @ApiModelProperty(value = "登录位置")
    private String location;
}

