package com.example.springBootLearn.conditionOnProperty;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    @ConditionalOnProperty(name = "special.bean.create", havingValue = "true")
    public BeanI createSpecialBean() {
        return new SpecialBean();
    }

    @Bean
    @ConditionalOnProperty(name = "special.bean.create", havingValue = "false", matchIfMissing = true)
    public BeanI createNormalBean() {
        return new SpecialBean();
    }
}
