package com.sakura.tables.entity;

import com.sakura.tables.dto.PageHelperJU;

import java.util.Date;

/**
 * @desc: 用户实体类
 * @auther: Sakura
 * @date:  10:08
 */
public class HelloWorldEntity extends PageHelperJU {

    /**标识*/
    private String id;

    /**登录名*/
    private String userName;

    /**密码*/
    private String userPassword;

    /**创建时间*/
    private Date createDate;

    /**状态*/
    private String dataStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String toString() {
        return "HelloWorldEntity{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", createDate=" + createDate +
                ", dataStatus='" + dataStatus + '\'' +
                '}';
    }
}