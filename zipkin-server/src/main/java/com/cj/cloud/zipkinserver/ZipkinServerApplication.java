package com.cj.cloud.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;


/**
 * 作为Eureka Client
 * 作为Zipkin Server
 */

@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinServer  //开启ZipkinServer的功能
@EnableZipkinStreamServer  //开启ZipkinStreamServer
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}