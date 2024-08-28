package com.LucasH.my_first_web_api.doc;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato; {
        return new Contact(
                "Lucas Henrique",
                ""
        )
    }
}
