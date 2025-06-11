package com.ohgiraffers.erekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/* 해당 어플리케이션을 Eureka Server 로 활성화 */
@EnableEurekaServer
public class Chap01ErekaServerLectureSoruceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap01ErekaServerLectureSoruceApplication.class, args);
	}

}
