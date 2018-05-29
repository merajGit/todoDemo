package com.emirates.group.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication

public class TodoApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(TodoApplication.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TodoApplication.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}
