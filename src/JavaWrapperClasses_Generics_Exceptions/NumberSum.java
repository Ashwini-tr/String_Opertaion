package JavaWrapperClasses_Generics_Exceptions;

public class NumberSum {
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (T element : array) {
            total += element.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};  // Input
        double result = sum(numbers);  // Sum calculation
        System.out.println("Sum: " + result);  // Output
    }

}
