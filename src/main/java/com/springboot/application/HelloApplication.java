package com.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Spring Boot 入口类
 * @author chenhao
 *
 */
@Controller
@SpringBootApplication	// Spring Boot项目的核心注解，主要目的是开启自动配置
@Configuration	// 该类也是spring的配置类
@ComponentScan(basePackages = "com.spri吃 ngboot")
public class HelloApplication {

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "Hello World！";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
