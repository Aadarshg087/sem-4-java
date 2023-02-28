public class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "Ram";
        System.out.println(strOb1);
        String strOb2 = "Rai";
        System.out.println(strOb2);
        String strOb3 = strOb1 + " and " + strOb2;
        System.out.println(strOb3);
        StringBuilder obj = new StringBuilder("Hello World");
        System.out.println("String = " + obj);
        System.out.println("Length of the string: " + obj.length());
        int capacity = obj.capacity();
        System.out.println("Capacity of the string: " + capacity);
        System.out.println(strOb1.equals(strOb2));
        System.out.println(strOb1.compareTo(strOb2));
    }
}
