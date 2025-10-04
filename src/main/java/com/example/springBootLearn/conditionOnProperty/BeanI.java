package com.example.springBootLearn.conditionOnProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


interface BeanI {
    public void beanType();
}

class SpecialBean implements BeanI {
    public void beanType() {
        System.out.println("Special Bean Created");
    }
}

class NormalBean implements BeanI {
    public void beanType() {
        System.out.println("Normal Bean Created");
    }
}
