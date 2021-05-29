package com.fantasy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fantasy")
public class AppConfig {

    public static long seleniumWaitTime = 20l;

}
