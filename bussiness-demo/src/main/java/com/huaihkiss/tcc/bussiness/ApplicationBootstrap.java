package com.huaihkiss.tcc.bussiness;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.huaihkiss.tcc.account.api","com.huaihkiss.tcc.user.api"})
@SpringCloudApplication
public class ApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class,args);
    }
}
