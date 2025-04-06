package com.example.java_bank_project;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Java Bank Project",
				description = "Backend Rest APIs for Java Bank Project",
				version = "v1.0",
				contact = @Contact(
						name = "Ahmet Yasin YILMAZ",
						email = "ylmzayasin@gmail.com",
						url = "https://github.com/Ahmet-Yasin-YILMAZ/JavaBankProject"
				),
				license = @License(
						name = "The Java Bank Project",
						url = "https://github.com/Ahmet-Yasin-YILMAZ/JavaBankProject"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Java Bank Project",
                url = "https://github.com/Ahmet-Yasin-YILMAZ/JavaBankProject"
		)
)
public class JavaBankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBankProjectApplication.class, args);
	}

}
