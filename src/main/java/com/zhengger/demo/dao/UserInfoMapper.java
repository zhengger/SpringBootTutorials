package com.zhengger.demo.dao;

import com.zhengger.demo.model.UserInfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:54
 */
@Mapper
public interface UserInfoMapper {
    UserInfo selectById(@Param("id") Integer id);
}