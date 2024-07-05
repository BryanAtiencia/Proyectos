package com.uce.hora_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@SpringBootApplication
public class HoraMicroApplication {
	@GetMapping("/hora")
	public String getHora() {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		return now.format(formatter);
	}
	public static void main(String[] args) {
		SpringApplication.run(HoraMicroApplication.class, args);
	}

}
