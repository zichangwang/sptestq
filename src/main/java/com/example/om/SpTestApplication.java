package com.example.om;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@ServletComponentScan
@SpringBootApplication
public class SpTestApplication extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(new Class[] { getClass() });
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpTestApplication.class, args);
	}
}