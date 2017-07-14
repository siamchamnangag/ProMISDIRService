package com.scg.dir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by marcus on 7/12/2017 AD.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        return builder.build();
    }

}