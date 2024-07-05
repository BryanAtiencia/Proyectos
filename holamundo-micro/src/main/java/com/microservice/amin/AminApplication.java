package com.microservice.amin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class AminApplication {

	//Execute on localhost:8080/{nombre} in this case /holamundo
	@GetMapping("/holamundo")
	public String getMessage(){
		return"Este es un microservicios, hola mundo :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(AminApplication.class, args);
	}

}
