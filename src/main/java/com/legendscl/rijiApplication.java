package com.legendscl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j//log（）...
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class rijiApplication {
    public static void main(String[] args) {
        SpringApplication.run(rijiApplication.class,args);
        log.info("启动成功");
    }
}
