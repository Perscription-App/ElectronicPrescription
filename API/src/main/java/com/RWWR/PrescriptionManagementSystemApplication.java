package com.RWWR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("secret.env")
public class PrescriptionManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrescriptionManagementSystemApplication.class, args);
	}

}
