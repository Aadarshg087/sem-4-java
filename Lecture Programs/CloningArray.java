public class CloningArray {
    public static void main(String[] args) {
        int a[] = { 1, 8, 3 };
        // Cloning array using method
        int b[] = a.clone();

        // Cloning Array manually   
        // int b[] = new int[a.length];
        // for (int i = 0; i < a.length; i++) {
        // b[i] = a[i];
        // }

        b[1]++;
        System.out.println("Contents of a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Contents of b: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
