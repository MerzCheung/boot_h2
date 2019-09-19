package com.mingzhang2.boot_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.mingzhang2.boot_h2.repository")
@EntityScan("com.mingzhang2.boot_h2.entity")
public class BootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootH2Application.class, args);
    }

}
