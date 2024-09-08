package com.saksham.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCollections1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaCollections1Application.class, args);
		
		int[] arr = new int[7];
		
		arr[0] = 20;
		
		System.out.println(arr[0]);
		
	}

}
