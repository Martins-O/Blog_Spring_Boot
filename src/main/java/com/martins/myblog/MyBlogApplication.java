package com.martins.myblog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MyBlogApplication {

    public static void main(String[] args) {
        log.info(":::::APPLICATION IS STARTING::::::");
        SpringApplication.run(MyBlogApplication.class, args);
        log.info(":::::APPLICATION STARTED::::::");
    }

}
