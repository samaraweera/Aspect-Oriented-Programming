package com.commonexception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CommonexceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonexceptionApplication.class, args);
        log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
    }

}
