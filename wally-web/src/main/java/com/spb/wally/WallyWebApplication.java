package com.spb.wally;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description 作用：
 * 1、配置（主要的Spring配置类）
 * 2、启动引导类
 * '@SpringBootApplication' 开启了Spring的组件扫描和Spring Boot的自动配置
 * --'@Configuration'：使用基于Java的配置，而不是XML配置；
 * 如果需要其他自定义配置可以将其写到一个单独的带有这个注解类里（@ComponentScan会进行扫描）
 * --'@ComponentScan'：启用组件扫描
 * --'@EnableAutoConfiguration'	：开启了Spring Boot自动配置的魔力
 * main----负责启动引导应用程序
 * @author: gaobh
 * @date: 2018/12/26
 * @version: v1.0
 */
@SpringBootApplication
@MapperScan("com.spb.wally.mapper")
//@ImportResource({"classpath:sign-config.xml"})
public class WallyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WallyWebApplication.class, args);
    }
}
