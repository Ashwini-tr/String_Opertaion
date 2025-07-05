package JavaWrapperClasses_Generics_Exceptions;

public class MaxInArray {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 15}; // Input array

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max: " + max);  // Output
    }
}
