/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.service.impl;

import cn.milkygreen.springboot.dao.UserRepository;
import cn.milkygreen.springboot.entity.User;
import cn.milkygreen.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/24 11:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
