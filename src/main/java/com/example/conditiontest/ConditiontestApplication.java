package com.example.conditiontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConditiontestApplication implements CommandLineRunner {

    @Autowired
    private DBConnection dbConnection;

    public static void main(String[] args) {
        SpringApplication.run(ConditiontestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dbConnection.printDB();
    }
}
