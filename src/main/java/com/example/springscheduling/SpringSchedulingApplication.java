package com.example.springscheduling;

import com.example.springscheduling.repositories.TestRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.example.springscheduling")
public class SpringSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulingApplication.class, args);
    }

    @Autowired
    private TestRepository repository;

    @Scheduled(cron = "0 * * * * *")
    public void testSchedule() {
        System.out.println(this.repository.getAllTest());
    }

}
