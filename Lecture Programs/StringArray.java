public class StringArray {
    public static void main(String[] args) {
        String name[] = new String[10];
        name[0] = "Hemanth";
        name[1] = "Aadarsh";
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.println("Character array: ");
        char name1[] = new char[4];
        name1[0] = 'H';
        name1[2] = 'A';
        for (int i = 0; i < name1.length; i++) {
            System.out.println(name1[i]);
        }
        System.out.println("Hello: " + name1[3]);
    }
}
