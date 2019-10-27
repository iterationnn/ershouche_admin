package com.kgc.che168_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages= {"com.kgc.che168_admin.dao"})
@EnableCaching
public class Che168AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(Che168AdminApplication.class, args);
	}

}
