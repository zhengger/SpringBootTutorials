package com.zhengger.demo.service.impl;


import com.zhengger.demo.dao.UserInfoMapper;
import com.zhengger.demo.model.UserInfo;
import com.zhengger.demo.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}