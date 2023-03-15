package com.lfl;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {})
@SpringBootConfiguration
@Slf4j
// 亦可以通过该注解扫描mapper使用注解的方式进行查询，mapper放入resources中
@MapperScan("com.lfl.dao.**")
@ConditionalOnProperty(value = "",havingValue = "",matchIfMissing = true)
@EnableEurekaClient // 即便注解和配置文件中未配置enable=true也可以通过eureka自动装配注册自动注册，因为eureka启动时获取默认配置为enable=true
public class springbootParent {
    public static void main(String[] args) {
        SpringApplication.run(springbootParent.class, args);
    }
}