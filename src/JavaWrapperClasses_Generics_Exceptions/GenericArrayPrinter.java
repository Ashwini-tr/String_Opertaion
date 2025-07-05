package JavaWrapperClasses_Generics_Exceptions;

public class GenericArrayPrinter {
    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to next line after printing
    }

    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C"}; // Input
        printArray(strArray); // Output: A B C
    }
}
