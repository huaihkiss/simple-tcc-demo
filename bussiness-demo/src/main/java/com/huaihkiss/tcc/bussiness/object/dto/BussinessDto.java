package com.huaihkiss.tcc.bussiness.object.dto;

import java.io.Serializable;

public class BussinessDto implements Serializable {
    private Integer userId;
    private String nickName;
    private Integer money;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
