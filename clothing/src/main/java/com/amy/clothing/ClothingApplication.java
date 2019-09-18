package com.amy.clothing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.amy.clothing.dao")
public class ClothingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothingApplication.class, args);
	}

}
