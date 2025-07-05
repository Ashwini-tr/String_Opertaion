package JavaWrapperClasses_Generics_Exceptions;

public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;    // Input 1
        int denominator = 0;   // Input 2

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
