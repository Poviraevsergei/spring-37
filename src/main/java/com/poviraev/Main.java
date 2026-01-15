package com.poviraev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Создание Spring контейнера(ApplicationContext)
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //Достаем из контекста Бин Car с названием AdamAnnotation
        Car car = (Car) context.getBean("car");
        car.setColor("Green");

        Car car1 = (Car) context.getBean("car");

        System.out.println(car.hashCode());
        System.out.println(car.getColor());
        System.out.println(car1.hashCode());
        System.out.println(car1.getColor());

        ((AnnotationConfigApplicationContext)context).close();
    }
}

//Scope:
//1. Singleton (default)
//2. Prototype










