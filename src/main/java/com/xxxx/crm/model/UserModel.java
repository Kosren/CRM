package com.xxxx.crm.model;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
public class UserModel {

    // private Integer userId;
    private String userName;
    private String trueName;

    private String userIdStr; // 加密后的用户ID


    /*public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getUserIdStr() {
        return userIdStr;
    }

    public void setUserIdStr(String userIdStr) {
        this.userIdStr = userIdStr;
    }
}
