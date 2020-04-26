package com.javaprogramto.schedulingjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:spring/external.properties")
public class SchedulingJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingJobsApplication.class, args);
	}

}
