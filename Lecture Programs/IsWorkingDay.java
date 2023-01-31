public class IsWorkingDay {
    public static void main(String[] args) {
        if (args[0].equals("Sunday") || args[0].equals("Saturday")) {
            System.out.println("Holiday");
        } else {
            System.out.println("Working day");
        }

    }
}
