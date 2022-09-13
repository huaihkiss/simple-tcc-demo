package com.huaihkiss.tcc.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
@SpringCloudApplication
@MapperScan("com.huaihkiss.tcc.user.mapper")
public class ApplicationBootstrap {
    public static void main(String[] args) {
        try{
            SpringApplication.run(ApplicationBootstrap.class,args);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }
}
