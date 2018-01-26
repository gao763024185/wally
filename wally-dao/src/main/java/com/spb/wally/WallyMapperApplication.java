package com.spb.wally;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *dao
 * @author gbh
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = "com.spb.wally.mapper")
public class WallyMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallyMapperApplication.class, args);
	}
}
