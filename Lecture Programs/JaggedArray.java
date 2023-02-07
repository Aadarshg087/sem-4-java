
public class JaggedArray {
    public static void main(String[] args) {
        int k = 0;
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k++);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Reverse Jagged array: ");
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(k++);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l < i * 2; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        n = 5;
        int p = n;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = p + 2; l > 0; l--) {
                System.out.print("*");
            }
            p = p - 2;
            System.out.println();
        }

    }
}
