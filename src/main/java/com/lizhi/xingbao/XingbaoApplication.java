package com.lizhi.xingbao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ServletComponentScan(basePackages = {"com.lizhi.xingbao"})
public class XingbaoApplication {

    public static void main(String[] args) {

        SpringApplication.run(XingbaoApplication.class, args);
    }
}
