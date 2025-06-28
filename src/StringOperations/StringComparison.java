package StringOperations;

public class StringComparison {
    public static void main(String[] args) {
        // Input strings
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // 1. Using equals()
        boolean isEqual = string1.equals(string2);
        System.out.println("equals(): " + isEqual);

        // 2. Using equalsIgnoreCase()
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2);
        System.out.println("equalsIgnoreCase(): " + isEqualIgnoreCase);

        // 3. Using compareTo()
        int comparisonResult = string1.compareTo(string2);
        System.out.println("compareTo(): " + comparisonResult);

        // 4. Using == operator (for reference comparison)
        boolean isSameReference = (string1 == string3);
        System.out.println("== operator: " + isSameReference);
    }
}

