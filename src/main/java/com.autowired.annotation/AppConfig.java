package com.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
///  Package Path [ it will scan all the beans file present in the package
@ComponentScan(basePackages = "com.autowired.annotation")
public class AppConfig {
}
