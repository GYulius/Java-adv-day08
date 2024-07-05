package functionalinterface.example01;

public class Main {
    public static void main(String[] args) {
        // Define a lambda expression for addition and assign it to a Calculator
        Calculator adunare = (a, b) -> (a + b);
        // Use the Calculator to add 10 and 5
        int rezultatAdunare = adunare.calculate(10, 5);
        // Print the result of the addition
        System.out.println(rezultatAdunare); // Prints: 15

        // Define a lambda expression for subtraction and assign it to a Calculator
        Calculator scadere = (a, b) -> (a - b);
        // Use the Calculator to subtract 5 from 10
        int rezultatScadere = scadere.calculate(10, 5);
        // Print the result of the subtraction
        System.out.println(rezultatScadere); // Prints: 5
    }
}