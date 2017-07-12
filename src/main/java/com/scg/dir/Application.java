package com.scg.dir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * Created by marcus on 7/12/2017 AD.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        System.out.println("ttewswt");
//        String url = "document-api.cloudhub.io/mock/v1/sap/dirs/1";
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
//
//
//        HttpEntity<?> entity = new HttpEntity<>(headers);
//
//        HttpEntity<String> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                entity,
//                String.class);
//
//        System.out.println(response.getBody());
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        return builder.build();
    }

}