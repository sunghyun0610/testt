package com.grepp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("issue 1");
        System.out.println("second issue에서 main 으로 merge");
        System.out.println("last test");

        System.out.println("user1이 작업한 코드");
        System.out.println("user2가 작업하였다.");
        System.out.println("t2의 작업");

        System.out.println("second의 작업");
    }

}
