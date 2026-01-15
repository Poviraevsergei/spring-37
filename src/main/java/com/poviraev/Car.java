package com.poviraev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

//DI:
// 1. Поле(Лучше так не делать)
// 2. Метод(Сеттер)
// 3. Конструктор(зы бест)
@Scope("singleton")
@Component
public class Car {
    private int id;
    private String model;
    private String color;
    private CarDriver carDriver;

    private String url;

    //@Autowired //Начиная с версии 4.3 можно не ставить если у класса только 1 конструктор
    public Car(CarDriver carDriver) {
        this.carDriver = carDriver;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarDriver(CarDriver carDriver) {
        this.carDriver = carDriver;
    }

    public int getId() {
        return id;
    }

    public CarDriver getCarDriver() {
        return carDriver;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @PostConstruct //Метод инициализации
    public void initSpring(){
        System.out.println("Spring Initialized: Car");
    }

    @PreDestroy
    public void destroySpring(){
        System.out.println("Spring Destroyed: Car");
    }
}
