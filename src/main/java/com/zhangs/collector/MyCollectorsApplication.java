package com.zhangs.collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyCollectorsApplication   extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MyCollectorsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyCollectorsApplication.class);
	}


}
