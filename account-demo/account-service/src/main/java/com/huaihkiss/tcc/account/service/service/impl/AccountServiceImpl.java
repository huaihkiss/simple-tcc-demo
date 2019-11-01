package com.huaihkiss.tcc.account.service.service.impl;

import com.huaihkiss.tcc.account.object.dto.AccountDto;
import com.huaihkiss.tcc.account.service.AccountService;
import com.huaihkiss.tcc.annotations.TryMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @TryMethod(cancelMethodName = "cancelUpdateAccount",confirmMethodName = "confirmUpdateAccount")
    @Override
    public Integer updateAccount(AccountDto dto) {
        System.out.println("updateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        logger.info("updateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        return dto.getMoney();
    }
    public Integer confirmUpdateAccount(AccountDto dto) {
        System.out.println("confirmUpdateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        logger.info("confirmUpdateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        return dto.getMoney();
    }
    public Integer cancelUpdateAccount(AccountDto dto) {
        System.out.println("cancelUpdateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        logger.info("cancelUpdateAccount userId:"+dto.getUserId()+",money:"+dto.getMoney());
        return dto.getMoney();
    }
}
