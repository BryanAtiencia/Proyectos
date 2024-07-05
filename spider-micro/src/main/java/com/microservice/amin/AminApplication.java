package com.microservice.amin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class AminApplication {
	public static void main(String[] args) {SpringApplication.run(AminApplication.class, args);
	}
}

@RestController
class AminController {
	@GetMapping("/holaspider")
	public ResponseEntity<byte[]> getImage() {
		try {
			Path path = Paths.get(new ClassPathResource("static/images/spider.jpg").getURI());
			if (!Files.exists(path)) {
				throw new IOException("File not found: " + path.toString());
			}
			byte[] imageBytes = Files.readAllBytes(path);
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.CONTENT_TYPE, "image/jpeg");
			return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<>(("Error: " + e.getMessage()).getBytes(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
