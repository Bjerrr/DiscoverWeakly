package com.dw.DW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DwApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

}
