// abstract class Dog {
//     public void bark() {
//         System.out.println("Bark! Bark!");
//     }

//     public abstract void isJump();
// };

// class Labra extends Dog {
//     public void isJump() {
//         boolean isJump = true;
//         System.out.println(isJump);
//     }
// };

class India {
    public void method() {
        System.out.println("hello world");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        // Labra l = new Labra();
        // l.bark();
        // l.isJump();

        India I = new India();
        I.method();

    }
}
