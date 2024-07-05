package functionalinterface.example01;

// Define a functional interface with a single abstract method
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}