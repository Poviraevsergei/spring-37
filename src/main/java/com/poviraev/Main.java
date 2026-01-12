package com.poviraev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Создание Spring контейнера(ApplicationContext)
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");

        //Достаем из контекста Бин Car с названием Adam
        Map<String, Car> car = context.getBeansOfType(Car.class);

        System.out.println(car);
    }
}