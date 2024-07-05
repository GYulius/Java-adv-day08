package functionalinterface.example03;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        // Check if the Optional is empty and print a message
        if (emptyOptional.isEmpty()) {
            System.out.println("Value is empty");
        }

        // Create an Optional with a value
        Optional<String> optionalWithValue = Optional.of("Hello");
        // Check if the Optional contains a value and print a message
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is present");
        }

        // Uncommenting the following lines would cause a NullPointerException
        // String value = null;
        // System.out.println(value.length());

        // Create an Optional with a value
        Optional<String> optionalString = Optional.of("Good");
        // Get the value from the Optional
        String value = optionalString.get();
        // Print the value
        System.out.println(value); // Prints: Good
    }
}