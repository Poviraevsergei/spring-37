package com.poviraev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.poviraev") //вычитай все классы по этому пути
public class Main {
    public static void main(String[] args) {
        //Создание Spring контейнера(ApplicationContext)
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        //Достаем из контекста Бин Car с названием AdamAnnotation
        Car car = (Car) context.getBean("AdamAnnotation");

        System.out.println(car.hashCode());

        System.out.println(car.getId());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}