package com.example_spring_kafka.spring_kafka_docker_int;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringKafkaDockerIntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaDockerIntApplication.class, args);
	}

}
