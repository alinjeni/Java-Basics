package com.onbill.java.programs;

final class Circle {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

public class FinalEx {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: "+circle.radius);
        // circle.radius=10; error because we cannot reassign

    }
}
