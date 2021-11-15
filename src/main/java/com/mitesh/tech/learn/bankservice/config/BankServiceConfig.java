package com.mitesh.tech.learn.bankservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * This is the Configuration class , which contains the common configurations
 * needed across the entire application.
 */
@Configuration
public class BankServiceConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


    /*
        Below method is responsible to load the message.properties file.
     */

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource=
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

/*    @Bean
    public LocalValidatorFactoryBean getValidator(){
        LocalValidatorFactoryBean factoryBean=new LocalValidatorFactoryBean();
        factoryBean.setValidationMessageSource(messageSource());
        return factoryBean;
    }*/

}
