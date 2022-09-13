package com.huaihkiss.tcc.account.mapper;

import com.huaihkiss.tcc.account.entity.UserAccount;
import com.huaihkiss.tcc.account.object.dto.SubmitOrderDTO;

import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    @Update("update user_account set balance = balance - #{amount}, freezing_balance = freezing_balance + #{amount} where user_id = #{userId}")
    void changeBalance(SubmitOrderDTO submitOrderDTO);

    @Update("update user_account set freezing_balance = freezing_balance - #{amount} where user_id = #{userId}")
    void changeFreezingBalance(SubmitOrderDTO submitOrderDTO);

}
