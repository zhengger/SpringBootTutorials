package com.zhengger.demo.service;

import com.zhengger.demo.model.UserInfo;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:56
 */
public interface UserInfoService {

    UserInfo selectById(Integer id);

}