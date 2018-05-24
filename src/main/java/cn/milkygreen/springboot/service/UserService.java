/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.service;

import cn.milkygreen.springboot.entity.User;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/24 11:12
 */
public interface UserService {

    User findByUserName(String userName);

}
