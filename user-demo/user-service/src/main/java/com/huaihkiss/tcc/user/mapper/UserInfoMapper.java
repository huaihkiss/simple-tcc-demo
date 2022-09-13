package com.huaihkiss.tcc.user.mapper;

import com.huaihkiss.tcc.user.entity.UserInfo;
import com.huaihkiss.tcc.user.object.dto.AddPointsDTO;

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
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Update("update user_info set reward_points = reward_points + #{points}, freezing_points = freezing_points - #{points} where id = #{userId}")
    int changePoints(AddPointsDTO addPointsDTO);

    @Update("update user_info set freezing_points = freezing_points + #{points} where id = #{userId}")
    int changeFreezingPoints(AddPointsDTO addPointsDTO);
}
