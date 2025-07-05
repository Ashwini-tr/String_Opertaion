package JavaWrapperClasses_Generics_Exceptions;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20}; // Array with 2 elements

        try {
            // Simulate a division by zero using array element
            int result = numbers[1] / 0; // Invalid index and division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
        }
    }
}
