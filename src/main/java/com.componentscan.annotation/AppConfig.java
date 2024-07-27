package com.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
///  Package Path [ it will scan all the beans file present in the package
@ComponentScan(basePackages = "com.componentscan.annotation")
public class AppConfig {
}
