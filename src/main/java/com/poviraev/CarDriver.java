package com.poviraev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CarDriver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initSpring(){
        System.out.println("Spring Initialized: CarDriver");
    }

    @PreDestroy
    public void destroySpring(){
        System.out.println("Spring Destroyed: CarDriver");
    }
}
