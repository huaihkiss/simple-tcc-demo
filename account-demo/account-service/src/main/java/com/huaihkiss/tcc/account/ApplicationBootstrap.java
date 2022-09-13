package com.huaihkiss.tcc.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
@MapperScan("com.huaihkiss.tcc.**.mapper")
@SpringCloudApplication
public class ApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class,args);
    }
}
