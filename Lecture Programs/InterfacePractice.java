interface Dog {
    public void bark();

    public void legs();
};

class German implements Dog {
    public void bark() {
        System.out.println("bark");

    }

    public void legs() {
        System.out.println("4 legs");
    }
};

public class InterfacePractice {
    public static void main(String[] args) {
        German d = new German();
        d.bark();
        d.legs();
    }

}
