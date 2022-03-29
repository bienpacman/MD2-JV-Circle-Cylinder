package com.company;

public class Cylinder extends Circle {
    private double height = 4;

    public Cylinder() {

    }
    public Cylinder(double radius, String color, double pi, double height) {
        super(radius, color, pi);
        this.height = height;

    }

    public Cylinder(double height, double volume) {
        this.height = height;
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    volatile double volume = 3.14*(radius*radius)*height;

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + volume +
                '}';
    }
}
