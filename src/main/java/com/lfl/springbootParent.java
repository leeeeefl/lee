package com.lfl;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
@Slf4j
// 亦可以通过该注解扫描mapper使用注解的方式进行查询，mapper放入resources中
@MapperScan("com.lfl.dao.**")
public class springbootParent {
    public static void main(String[] args) {
        SpringApplication.run(springbootParent.class,args);
    }
}