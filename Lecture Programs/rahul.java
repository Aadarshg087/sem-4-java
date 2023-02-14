
public class rahul {
    enum days {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday
    };

    public static void dayIsLike() {
        days day = days.thursday;
        switch (day) {
            case monday:
                System.out.println("m");
                break;

            case thursday:
            case tuesday:
                System.out.println("tue");
                break;

            default:
                System.out.println("default");
                break;
        }
    }

    public static void main(String[] args) {
        dayIsLike();

    }
}