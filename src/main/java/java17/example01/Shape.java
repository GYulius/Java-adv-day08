package java17.example01;

// Define an abstract sealed class Shape, which permits only Circle and Rectangle to extend it
public abstract sealed class Shape permits Circle, Rectangle {
    // Abstract method to calculate the area of the shape
    public abstract double area();
}
