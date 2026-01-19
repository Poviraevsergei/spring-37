package com.poviraev;

import com.poviraev.annotation.TimerAop;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Random;

@Scope("singleton")
@Component
public class Car {
    private int id;
    private String model;
    private String color;
    private CarDriver carDriver;

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

    @TimerAop
    public Boolean start(){
        System.out.println("Car started");
        try {
            Thread.sleep(new Random().nextLong(1,100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stop(); //Проблема что в stop AOP не будет вызван!!!
        return true;
    }

    @TimerAop
    public Boolean stop(){
        System.out.println("Car stopped");
        return true;
    }

    @PostConstruct
    public void initSpring(){
        System.out.println("Spring Initialized: Car");
    }

    @PreDestroy
    public void destroySpring(){
        System.out.println("Spring Destroyed: Car");
    }
}
