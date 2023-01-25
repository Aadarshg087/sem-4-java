import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class Week2_26699_2 {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        float a, b, c;
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        int num1 = (int) a;
        int num2 = (int) b;
        int num3 = (int) c;
        if (num1 == a) {
            System.out.print((int) a + " ");
        } else
            System.out.print((num1 + 1) + " ");
        if (num2 == b) {
            System.out.print((int) b + " ");
        } else
            System.out.print((num2 + 1) + " ");
        if (num3 == c) {
            System.out.print((int) c + " ");
        } else
            System.out.print((num3 + 1) + " ");
    }

}
