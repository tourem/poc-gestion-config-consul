package com.larbotech.gestion.config.consul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConsulApplication {

    @Value("${count}")
    private Integer count;

    @GetMapping("/count")
    public Integer getCount() {
        return count;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }
}
