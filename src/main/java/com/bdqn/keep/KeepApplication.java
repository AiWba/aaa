package com.bdqn.keep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.keep.mapper")
public class KeepApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeepApplication.class, args);
    }

}
