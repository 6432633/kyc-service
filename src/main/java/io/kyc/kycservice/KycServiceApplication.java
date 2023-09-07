package io.kyc.kycservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KycServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycServiceApplication.class, args);
	}

}
