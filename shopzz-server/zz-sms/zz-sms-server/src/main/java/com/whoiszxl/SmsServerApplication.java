package com.whoiszxl;

import com.whoiszxl.utils.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * spms启动类
 */
@EnableScheduling
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.whoiszxl.mapper")
public class SmsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsServerApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
