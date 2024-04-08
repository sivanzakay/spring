package com.spring.annotations;

import com.spring.annotations.services.LockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring.annotations.controllers","com.spring.annotations.services"})
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAnnotationsApplication.class, args);
        LockService lockService = new LockService()
        Thread t1 = new Thread(new )
    }

}
