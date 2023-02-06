/**
 * ArrayCode
 */
public class ArrayCode {

    public static void main(String[] args) {
        float marks[] = new float[5];
        marks[0] = 15.12f;
        // Double = 15 digit after deciaml
        // Float = 6 digits after the decimal
        marks[4] = 20;
        System.out.println("The size/length of the array: " + marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}