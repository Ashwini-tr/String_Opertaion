package JavaWrapperClasses_Generics_Exceptions;

import java.util.Arrays;

public class GenericSwap {
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3}; // Input array
        int index1 = 0;
        int index2 = 2;

        System.out.println("Before swap: " + Arrays.toString(numbers));
        swap(numbers, index1, index2);
        System.out.println("After swap: " + Arrays.toString(numbers));
    }
}
