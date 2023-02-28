import javax.sound.sampled.SourceDataLine;

public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("Time taken for creation in string literals: " + (endTime - startTime) + " in millseconds");
    }
}
