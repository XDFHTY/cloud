package com.cj.cloud.consulmiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用consul作为服务注册发现中心
 *
 */

@SpringBootApplication
@EnableDiscoveryClient  //开启服务发现
@RestController
public class ConsulMiyaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsulMiyaApplication.class).web(true).run(args);
	}


	//健康检查的实现REST部分
	@RequestMapping("/health")
	public String health() {
		return "hello health ";
	}

	@RequestMapping("/hi")
	public String home() {
		return "hi ,i'm miya";
	}
}
