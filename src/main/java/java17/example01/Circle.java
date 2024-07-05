package java17.example01;

// Define the Circle class as a final class, meaning it cannot be subclassed
public final class Circle extends Shape {
    // Private final field to store the radius of the circle
    private final double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the abstract area method to provide the implementation for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle = π * r^2
    }
}
