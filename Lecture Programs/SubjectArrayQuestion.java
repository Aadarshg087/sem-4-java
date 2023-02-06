import java.util.Scanner;

/**
 * SubjectArrayQuestion
 */
public class SubjectArrayQuestion {

    static public void percentage(int marks[], int number_of_subjects) {
        float sum = 0;
        for (int i = 0; i < number_of_subjects; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum / number_of_subjects);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_subjects = sc.nextInt();
        int marks[] = new int[number_of_subjects];
        for (int i = 0; i < number_of_subjects; i++) {
            marks[i] = sc.nextInt();
        }
        sc.close();
        // Printing the array
        for (int i = 0; i < number_of_subjects; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        percentage(marks, number_of_subjects);
    }
}