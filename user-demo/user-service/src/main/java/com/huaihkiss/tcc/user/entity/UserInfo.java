package com.huaihkiss.tcc.user.entity;

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
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账户
     */
    private String userName;

    /**
     * 奖励积分
     */
    private Long rewardPoints;


    private Integer freezingPoints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(Long rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public Integer getFreezingPoints() {
        return freezingPoints;
    }

    public  void setFreezingPoints(Integer freezingPoints) {
        this.freezingPoints = freezingPoints;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
            "id=" + id +
            ", userName=" + userName +
            ", rewardPoints=" + rewardPoints +
        "}";
    }



}
