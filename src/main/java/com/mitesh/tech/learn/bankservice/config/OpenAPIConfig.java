package com.mitesh.tech.learn.bankservice.config;

import com.mitesh.tech.learn.bankservice.constant.AppConstant;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This Open API Configuration class contains the configurations for Open API Definition.
 * Additionally this class also has versioning and security enabled on UI.
 *
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */
@Configuration
public class OpenAPIConfig {

    private final String securitySchemaName = "bearerAuth";

   @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(securitySchemaName))
                .components(
                        new Components()
                                .addSecuritySchemes(securitySchemaName,
                                            new SecurityScheme()
                                                    .name(securitySchemaName)
                                                    .type(SecurityScheme.Type.HTTP)
                                                    .scheme("bearer")
                                                    .bearerFormat("JWT")
                                )
                )
                .info(new Info()
                        .title(AppConstant.APP_TITLE)
                        .version(AppConstant.APP_VERSION)
                        .description(AppConstant.APP_DESCRIPTION)
                        .contact(new Contact().email(AppConstant.TEAM_DL).name(AppConstant.TEAM_NAME)));
        }

    /*
      Below method aims to Display the controller those should be under the specification
      of bankservice-1.0.0
     */
    @Bean
    public GroupedOpenApi v1OpenApi(){
        return GroupedOpenApi.builder().group("bankservice-1.0.0").packagesToScan(AppConstant.v1PackagesToScan).build();
    }

}
