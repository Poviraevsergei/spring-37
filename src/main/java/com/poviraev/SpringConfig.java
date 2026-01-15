package com.poviraev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.poviraev") //вычитай все классы по этому пути
public class SpringConfig {

    @Bean
    public Car getCar() {
        return new Car(null);
    }
}
