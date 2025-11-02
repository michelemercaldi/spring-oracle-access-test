package it.rada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
curl:
curl -X GET http://localhost:8080/api/prenotazioni

swagger
Swagger UI: http://localhost:8080/swagger-ui.html
OpenAPI Docs: http://localhost:8080/v3/api-docs
*/

