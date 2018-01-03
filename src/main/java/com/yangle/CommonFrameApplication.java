package com.yangle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@MapperScan("com.yangle.mapper") //启用mapper扫描
@SpringBootApplication
//@EnableJms//开启jms注解
@EnableCaching//开启缓存机制
//@EnableScheduling//开启定时器
public class CommonFrameApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CommonFrameApplication.class, args);
	}
	@Bean
	public StartUpListener startUpListener(){
		return new StartUpListener();
	};
}
