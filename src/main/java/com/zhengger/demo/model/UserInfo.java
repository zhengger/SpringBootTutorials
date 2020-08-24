package com.zhengger.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:55
 */
public class UserInfo {

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}