package functionalinterface.example02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Function to calculate the square of a number
        Function<Integer, Integer> square = (x) -> (x * x);
        // Apply the function to the number 4 and print the result
        System.out.println(square.apply(4)); // Prints: 16

        // Consumer to print a greeting message
        Consumer<String> printer = (s) -> System.out.println("Hello " + s + " !");
        // Accept the string "Java" and print the greeting
        printer.accept("Java"); // Prints: Hello Java !

        // Predicate to check if a number is positive
        Predicate<Integer> isPositive = (x) -> (x > 0);
        // Test the predicate with the number 5 and print the result
        System.out.println("Is 5 positive? " + isPositive.test(5)); // Prints: Is 5 positive? true
        // Test the predicate with the number -3 and print the result
        System.out.println("Is -3 positive? " + isPositive.test(-3)); // Prints: Is -3 positive? false
    }
}