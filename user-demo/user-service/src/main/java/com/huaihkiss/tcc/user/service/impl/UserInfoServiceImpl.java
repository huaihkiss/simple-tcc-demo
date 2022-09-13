package com.huaihkiss.tcc.user.service.impl;

import com.huaihkiss.tcc.user.entity.UserInfo;
import com.huaihkiss.tcc.user.mapper.UserInfoMapper;
import com.huaihkiss.tcc.user.object.dto.AddPointsDTO;
import com.huaihkiss.tcc.user.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huaihkiss.tcc.annotations.TryMethod;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
@Service
@Transactional
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
    private final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    private UserInfoMapper userInfoMapper;

    @TryMethod(cancelMethodName = "cancelAddPoints",confirmMethodName = "confirmAddPoints")
    @Override
    public String addPoint(AddPointsDTO addPointsDTO){
        userInfoMapper.changeFreezingPoints(addPointsDTO);
        int i = 0 / 0;
        return "ok";
    }
    public String confirmAddPoints(AddPointsDTO addPointsDTO){
        System.out.println("confirmAddPoints userId:"+addPointsDTO.getUserId()+",money:"+addPointsDTO.getPoints());
        logger.info("confirmAddPoints userId:"+addPointsDTO.getUserId()+",money:"+addPointsDTO.getPoints());
        userInfoMapper.changePoints(addPointsDTO);
        return "ok";
    }
    public String cancelAddPoints(AddPointsDTO addPointsDTO){
        System.out.println("cancelAddPoints userId:"+addPointsDTO.getUserId()+",money:"+addPointsDTO.getPoints());
        logger.info("cancelAddPoints userId:"+addPointsDTO.getUserId()+",money:"+addPointsDTO.getPoints());
        addPointsDTO.setPoints(-addPointsDTO.getPoints());
        userInfoMapper.changeFreezingPoints(addPointsDTO);
        return "ok";
    }
}
