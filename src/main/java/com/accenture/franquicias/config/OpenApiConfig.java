package com.accenture.franquicias.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI FranquiciaOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gestor de Franquicias API")
                        .version("1.0")
                        .description("Documentación de la API de franquicias con OpenAPI y Swagger")
                        .contact(new Contact()
                                .name("Soporte API")
                                .email("sadith.nunezr@gmail.com")
                                .url("https://www.linkedin.com/in/sadith-nunez-r")
                        )
                );
    }
}
