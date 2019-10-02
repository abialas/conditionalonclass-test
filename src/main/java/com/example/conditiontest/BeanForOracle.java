package com.example.conditiontest;

import oracle.jdbc.OracleDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(OracleDriver.class)
@ConditionalOnMissingBean(BeanForPostgres.class)
public class BeanForOracle implements DBConnection {
    @Override
    public void printDB() {
        System.out.println("oracle db");
    }
}
