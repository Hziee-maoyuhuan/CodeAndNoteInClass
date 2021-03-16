package com.taopiaopiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TaopiaopiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaopiaopiaoApplication.class, args);
    }

}
