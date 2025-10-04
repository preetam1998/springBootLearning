package com.example.springBootLearn.conditionOnProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConditionOnPropertyExample {
    @Autowired
    private BeanI bean;

    public void getBeanType() {
        bean.beanType();
    }
}
