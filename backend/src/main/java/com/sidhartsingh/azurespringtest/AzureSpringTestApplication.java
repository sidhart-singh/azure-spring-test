package com.sidhartsingh.azurespringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AzureSpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringTestApplication.class, args);
    }

}
