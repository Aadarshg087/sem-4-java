import java.util.Scanner;

interface Cube {
    int Compute(int X);
}

interface Circle {
    int ComputeCircle(int X, int Y);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int A = S.nextInt();
        Cube C = (int X) -> {
            int Z = X + X;
            return Z;
        };
        int result = C.Compute(A);
        System.out.println("Cube of value is: " + result);

        // Multiple class with different argument
        Circle L = (int X, int Y) -> 3 * X * X;
        int resultCircle = L.ComputeCircle(A, A);
        System.out.println("Area of circle is: " + resultCircle);
        S.close();
    }
}
