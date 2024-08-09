package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info=@Info(
		title="Accounts microservice REST API Documentation",
		description = "EazyBank Accounts microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
			name = "Ryan",
			email = "ryanangelo@eazybytes.com",
			url = "https://eazybytes.com"
		),
		license = @License(
			name = "Apache 2.0",
			url =  "https://eazybytes.com"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "EazyBank Accounts microservice REST API Documentation",
		url = "https://eazybytes.com/swagger-ui/index.html"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
