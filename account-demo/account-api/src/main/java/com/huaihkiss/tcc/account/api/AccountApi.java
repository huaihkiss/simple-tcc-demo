package com.huaihkiss.tcc.account.api;

import com.huaihkiss.tcc.account.object.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("account-service")
public interface AccountApi {
    @PostMapping("updateAccount")
    Integer updateAccount(@RequestBody AccountDto dto);
}
