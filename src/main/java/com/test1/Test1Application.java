package com.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
                String name = "mike";
                int x = 100;		
		SpringApplication.run(Test1Application.class, args);
	}

}
