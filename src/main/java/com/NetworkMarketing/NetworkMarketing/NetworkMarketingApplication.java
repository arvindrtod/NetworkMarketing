package com.NetworkMarketing.NetworkMarketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NetworkMarketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkMarketingApplication.class, args);
	}

}
