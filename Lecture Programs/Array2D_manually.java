public class Array2D_manually {
    public static void main(String[] args) {
        int array2D[][] = new int[4][];
        // Very important concept
        // there should only one col for the row 0
        // there should only two col for the row 1

        array2D[0] = new int[1];
        array2D[1] = new int[2];
        array2D[2] = new int[3];
        array2D[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                array2D[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(array2D[i][j] + " ");
            System.out.println();
        }

    }
}
