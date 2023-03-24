package com.springboot.taku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController 注解表示这个类是一个 RESTful Controller
//而 @GetMapping 注解则表示这个方法对应 HTTP GET 请求。
//@SpringBootApplication 来标记这是一个 Spring Boot 应用程序，
//它包括了 Spring 的默认配置、Spring MVC 等。

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.taku.repository")

@EntityScan("com.springboot.taku.entity")
@RestController
public class DemobytakuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobytakuApplication.class, args);
	}
	   @GetMapping("/")
	    public String helloWorld() {
	        return "Hello World!";
	    }
	  

}
