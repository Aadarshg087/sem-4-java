import java.math.BigInteger;
import java.util.Scanner;
class First {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = console.nextInt();
        int years = 65 - age;
        System.out.println(years + " years unitl retirement!");
        System.out.println("Enter a float number: ");
        float num1 = console.nextFloat();
        System.out.println("num1: "+ num1);
        System.out.println("Enter a double value: ");
        double num3= console.nextDouble();
        System.out.println("Double value is: "+num3);
        System.out.println("Enter a long number: ");
        long num4=console.nextLong();
        System.out.println("Here is the long numeber: "+num4);
        System.out.println("Enter: "); 
        String num5 = console.next();
        System.out.println("String is: "+ num5);
        System.out.println("Enter a bigInteger: ");
        BigInteger value = console.nextBigInteger();
        System.out.println("BigInteger: "+ value);
        System.out.println("Enter a boolean value: ");
        boolean num2 = console.nextBoolean();
        System.out.println("Boolean value is: "+num2);
        console.close();
    }
}