package JavaWrapperClasses_Generics_Exceptions;

public class ExceptionPropagation {
    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        // Division by zero triggers ArithmeticException
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");
        }
    }
}
