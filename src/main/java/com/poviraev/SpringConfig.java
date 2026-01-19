package com.poviraev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //ВКЛ AOP
@Configuration
@ComponentScan("com.poviraev")
public class SpringConfig {

}
