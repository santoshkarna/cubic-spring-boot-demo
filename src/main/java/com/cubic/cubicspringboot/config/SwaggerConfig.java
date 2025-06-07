package com.cubic.cubicspringboot.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    public OpenAPI springOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Cubic Spring Boot Demo")
                        .description("Spring boot rest api documentation")
                        .version("v.1")
                        .license(new License().name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .externalDocs(new ExternalDocumentation()
                        .description("Cubic Spring Boot WIKI Documentation")
                        .url("https://github.com/cubic/cubic-springboot-demo"));
    }
}
