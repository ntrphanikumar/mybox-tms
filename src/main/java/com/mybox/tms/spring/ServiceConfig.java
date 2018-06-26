package com.mybox.tms.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mybox.tms.service" })
public class ServiceConfig {
}
