package com.spb.wally.service;

import com.spb.wally.WallyMapperApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * service 启动
 * @author gbh
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackageClasses = WallyMapperApplication.class)
public class WallyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallyServiceApplication.class, args);
	}
}
