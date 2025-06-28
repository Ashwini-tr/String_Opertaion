package StringOperations;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 1000;
        long startTime, endTime;

        // 1. String Concatenation
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "test";
        }
        endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("String: " + stringTime + "ms");

        // 2. StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("test");
        }
        endTime = System.nanoTime();
        long builderTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuilder: " + builderTime + "ms");

        // 3. StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("test");
        }
        endTime = System.nanoTime();
        long bufferTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuffer: " + bufferTime + "ms");
    }
}

