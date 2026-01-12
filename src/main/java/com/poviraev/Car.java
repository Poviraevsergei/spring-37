package com.poviraev;

import org.springframework.stereotype.Component;

//Будущий бин(singleton)
@Component(value = "AdamAnnotation") //Component - потенциальный бин
public class Car {
    private int id;
    private String model;
    private String color;

    public Car() {

    }

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
