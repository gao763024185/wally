package com.spb.wally.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * web 启动
 * @author gbh
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = "com.spb.wally")
@MapperScan("com.spb.wally.mapper")
public class WallyWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallyWebApplication.class, args);
	}
}
