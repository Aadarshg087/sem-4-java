/**
 * 2DArray
 */
public class Array2D {

    public static void main(String[] args) {
        int array2D[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                array2D[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(array2D[i][j] + " ");
            System.out.println();
        }
    }
}