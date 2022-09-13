package com.huaihkiss.tcc.account.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
@TableName("user_account")
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 账户类型
     */
    private Integer accType;

    /**
     * 余额
     */
    private Long balance;

    private Integer freezingBalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Integer getAccType() {
        return accType;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Integer getFreezingBalance() {
        return freezingBalance;
    }

    public void setFreezingBalance(Integer freezingBalance) {
        this.freezingBalance = freezingBalance;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
            "id=" + id +
            ", userId=" + userId +
            ", accType=" + accType +
            ", balance=" + balance +
        "}";
    }
}
