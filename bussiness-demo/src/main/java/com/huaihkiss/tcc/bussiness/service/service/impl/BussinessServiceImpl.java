package com.huaihkiss.tcc.bussiness.service.service.impl;

import com.huaihkiss.tcc.account.api.AccountApi;
import com.huaihkiss.tcc.account.object.dto.AccountDto;
import com.huaihkiss.tcc.annotations.GlobalTransaction;
import com.huaihkiss.tcc.bussiness.object.dto.BussinessDto;
import com.huaihkiss.tcc.bussiness.service.BussinessService;
import com.huaihkiss.tcc.user.api.UserApi;
import com.huaihkiss.tcc.user.object.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BussinessServiceImpl implements BussinessService {
    private final Logger logger = LoggerFactory.getLogger(BussinessServiceImpl.class);
    @Autowired
    private AccountApi accountApi;
    @Autowired
    private UserApi userApi;

    @GlobalTransaction(cancelMethodName = "cancelEcho",confirmMethodName = "confirmEcho")
    @Override
    public String echo(BussinessDto dto) {
        AccountDto accountDto = new AccountDto();
        accountDto.setMoney(dto.getMoney());
        accountDto.setUserId(dto.getUserId());
        UserDto userDto = new UserDto();
        userDto.setNickName(dto.getNickName());
        userDto.setUserId(dto.getUserId());
        accountApi.updateAccount(accountDto);
        userApi.updateUser(userDto);
        return dto.getNickName();
    }
    public String cancelEcho(BussinessDto dto) {
        logger.info("cancelEcho nickName:"+dto.getNickName()+",userId:"+dto.getUserId()+",money:"+dto.getMoney());
        System.out.println("cancelEcho nickName:"+dto.getNickName()+",userId:"+dto.getUserId()+",money:"+dto.getMoney());
        return dto.getNickName();
    }
    public String confirmEcho(BussinessDto dto) {
        logger.info("confirmEcho nickName:"+dto.getNickName()+",userId:"+dto.getUserId()+",money:"+dto.getMoney());
        System.out.println("confirmEcho nickName:"+dto.getNickName()+",userId:"+dto.getUserId()+",money:"+dto.getMoney());
        return dto.getNickName();
    }
}
