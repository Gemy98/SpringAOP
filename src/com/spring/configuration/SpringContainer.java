package com.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.spring")
@EnableAspectJAutoProxy
public class SpringContainer {

}
