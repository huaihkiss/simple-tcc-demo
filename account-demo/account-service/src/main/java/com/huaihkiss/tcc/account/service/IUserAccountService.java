package com.huaihkiss.tcc.account.service;

import com.huaihkiss.tcc.account.entity.UserAccount;
import com.huaihkiss.tcc.account.object.dto.SubmitOrderDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
public interface IUserAccountService extends IService<UserAccount> {
    Integer addOrder(SubmitOrderDTO submitOrderDTO);
}
