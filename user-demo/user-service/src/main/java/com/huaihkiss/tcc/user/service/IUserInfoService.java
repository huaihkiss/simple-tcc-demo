package com.huaihkiss.tcc.user.service;

import com.huaihkiss.tcc.user.entity.UserInfo;
import com.huaihkiss.tcc.user.object.dto.AddPointsDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
public interface IUserInfoService extends IService<UserInfo> {
    String addPoint(AddPointsDTO addPointsDTO);
}
