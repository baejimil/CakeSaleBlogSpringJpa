package com.baejimeel.cakeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CakeBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CakeBlogApplication.class, args);
    }

}
