package com.huaihkiss.tcc.account.object.dto;

import java.io.Serializable;

public class AccountDto implements Serializable {
    private Integer userId;
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
}
