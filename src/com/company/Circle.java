package com.company;

public class Circle {
    double radius = 1.5;
    private String color = "blue";
    private Double PI = 3.14;


    public Circle(double radius, String color, double pi) {
    }

    public Circle() {
        this.radius = radius;
        this.color = color;
        this.PI = PI;
        this.acreage = acreage;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double acreage = (radius * radius) * 3.14;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                ", acreage=" + acreage +
                '}';
    }
}