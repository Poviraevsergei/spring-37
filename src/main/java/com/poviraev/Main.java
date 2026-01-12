package com.poviraev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Создание Spring контейнера(ApplicationContext)
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");

        //Достаем из контекста Бин Car с названием Adam
        Car car = (Car) context.getBean("Adam");
        Car car1 = (Car) context.getBean("Adam");

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());

        System.out.println(car.getId());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}