package com.huaihkiss.tcc.user.service.impl;

import com.huaihkiss.tcc.annotations.TryMethod;
import com.huaihkiss.tcc.user.object.dto.UserDto;
import com.huaihkiss.tcc.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @TryMethod(cancelMethodName = "cancelUpdateUser",confirmMethodName = "confirmUpdateUser")
    @Override
    public String updateUser(UserDto dto) {

        logger.info("updateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        System.out.println("updateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        return dto.getNickName();
    }
    public String confirmUpdateUser(UserDto dto) {
        logger.info("confirmUpdateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        System.out.println("confirmUpdateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        return dto.getNickName();
    }
    public String cancelUpdateUser(UserDto dto) {
        logger.info("cancelUpdateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        System.out.println("cancelUpdateUser:"+dto.getNickName()+",id:"+dto.getUserId());
        return dto.getNickName();
    }
}
