package poo.abstract_.entities;

import poo.abstract_.entities.enums.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
