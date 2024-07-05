package java17.example01;

import java17.example01.Shape;

// Define the Rectangle class as a final class, meaning it cannot be subclassed
public final class Rectangle extends Shape {
    // Private final fields to store the width and height of the rectangle
    private final double width;
    private final double height;

    // Constructor to initialize the width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the abstract area method to provide the implementation for Rectangle
    @Override
    public double area() {
        return width * height; // Area of a rectangle = width * height
    }
}