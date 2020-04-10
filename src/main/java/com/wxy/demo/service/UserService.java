package com.wxy.demo.service;

import com.wxy.demo.entity.User;
import com.wxy.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:07
 * @Description 用户业务层
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户列表
     *
     * @return
     */
    public List<User> queryUserList() {
        return userMapper.queryList();
    }
}
