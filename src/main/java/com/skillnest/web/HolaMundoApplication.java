package com.skillnest.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//1. anotacion
@RestController
public class HolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}

	//2. anotacion
	@RequestMapping("/")
	//3. definir metodo
	public String hola() {
		return "Hola Mundo!!";
	}
	
}
