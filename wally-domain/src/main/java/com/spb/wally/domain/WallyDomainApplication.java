package com.spb.wally.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WallyDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallyDomainApplication.class, args);
	}
}
