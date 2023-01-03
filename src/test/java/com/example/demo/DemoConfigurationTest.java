package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class DemoConfigurationTest
{
    @Bean
    public MyService getService()
    {
        return new MyTestServiceImpl();
    }
}