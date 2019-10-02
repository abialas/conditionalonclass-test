package com.example.conditiontest;

import org.postgresql.Driver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(Driver.class)
public class BeanForPostgres implements DBConnection {
    @Override
    public void printDB() {
        System.out.println("postgres driver");
    }
}
