package com.h3c.solution.platform.spcaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//是入口模块，需要配置 spring boot。由于我们使用了Spring Boot的依赖注入功能，所以我们需要在入口类上加上注解指明要IOC要扫描的包范围
@ComponentScan(value = "com.h3c.solution.platform")
@SpringBootApplication
public class SpCaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpCaServerApplication.class, args);
	}
}
