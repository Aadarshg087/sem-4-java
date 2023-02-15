public class Cube {

    private int length;
    private int breadth;
    private int height;

    public Cube() {
        length = 10;
        breadth = 10;
        height = 10;
        System.out.println("Calling the default constructor: ");
        System.out.println(length + " " + breadth + " " + height);
    }

    public Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Calling the parameterized contructor: ");
        System.out.println(length + " " + breadth + " " + height);
    }

    public static void main(String[] args) {

        Cube obj1 = new Cube();
        Cube obj2 = new Cube(100, 200, 300);

    }
}