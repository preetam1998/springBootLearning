package com.example.springBootLearn.conditionOnProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ConditionOnPropertyApp {
    public static void main(String[]args) {
        ApplicationContext context = SpringApplication.run(ConditionOnPropertyApp.class, args);
        ConditionOnPropertyExample obj = context.getBean(ConditionOnPropertyExample.class);
        obj.getBeanType();
    }
}
