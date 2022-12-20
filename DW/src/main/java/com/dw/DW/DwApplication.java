package com.dw.DW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DwApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

	//med restemplate kan man göra http calls, dom är dock i blocking miljö med det borde vara ok
	//då är det bara att instansiera i en class och sedan köra dess metoder
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
