package com.huaihkiss.tcc.user.object.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private Integer userId;
    private String nickName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
