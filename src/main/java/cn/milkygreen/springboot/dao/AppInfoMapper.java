/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.dao;

import cn.milkygreen.springboot.entity.AppInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/24 15:37
 */
@Mapper
public interface AppInfoMapper {

    @Select("SELECT * FROM app_info")
    @Results({
            @Result(property = "appId",  column = "APP_ID"),
            @Result(property = "appKey", column = "APP_KEY")
    })
    List<AppInfo> getAll();

}
