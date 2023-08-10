package com.test.restServer1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Eventty API 명세서",
		description = "API 명세서",
		version = "v1",
		contact = @Contact(name = "wow", email = "wow@gmail.com")
	)
)
@SpringBootApplication
public class RestServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestServer1Application.class, args);
	}

}
