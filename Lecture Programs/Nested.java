class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class Nested {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);

    }
}
