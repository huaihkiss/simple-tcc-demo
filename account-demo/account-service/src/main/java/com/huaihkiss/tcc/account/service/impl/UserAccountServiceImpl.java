package com.huaihkiss.tcc.account.service.impl;

import com.huaihkiss.tcc.account.entity.UserAccount;
import com.huaihkiss.tcc.account.mapper.UserAccountMapper;
import com.huaihkiss.tcc.account.object.dto.SubmitOrderDTO;
import com.huaihkiss.tcc.account.service.IUserAccountService;
import com.huaihkiss.tcc.annotations.TryMethod;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements IUserAccountService {
    private final Logger logger = LoggerFactory.getLogger(UserAccountServiceImpl.class);
    @Autowired
    private UserAccountMapper userAccountMapper;
    
    @TryMethod(cancelMethodName = "cancelAddOrder",confirmMethodName = "confirmAddOrder")
    @Override
    public Integer addOrder(SubmitOrderDTO submitOrderDTO){
        userAccountMapper.changeBalance(submitOrderDTO);
        return 1;
    }

    public Integer confirmAddOrder(SubmitOrderDTO submitOrderDTO){
        System.out.println("confirmAddOrder userId:"+submitOrderDTO.getUserId()+",money:"+submitOrderDTO.getAmount());
        logger.info("confirmAddOrder userId:"+submitOrderDTO.getUserId()+",money:"+submitOrderDTO.getAmount());
        userAccountMapper.changeFreezingBalance(submitOrderDTO);
        return 1;
    }

    public Integer cancelAddOrder(SubmitOrderDTO submitOrderDTO){
        System.out.println("cancelAddOrder userId:"+submitOrderDTO.getUserId()+",money:"+submitOrderDTO.getAmount());
        logger.info("cancelAddOrder userId:"+submitOrderDTO.getUserId()+",money:"+submitOrderDTO.getAmount());
        submitOrderDTO.setAmount(-submitOrderDTO.getAmount());
        userAccountMapper.changeBalance(submitOrderDTO);
        return 1;
    }

}
