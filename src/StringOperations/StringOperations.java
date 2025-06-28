package StringOperations;

public class StringOperations {
    public static void main(String[] args) {
        // Input string
        String input = "HELLO WORLD";

        // 1. Length of the string
        int length = input.length();

        // 2. First character
        char firstChar = input.charAt(0);

        // 3. Substring - extracting "World" (from index 6 to end)
        // Convert to lowercase to match output format
        String substring = input.substring(6).toLowerCase();

        // Output results
        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + substring);
    }
}
