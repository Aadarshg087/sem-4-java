class Animal {
    protected void display() {
        System.out.println("I am an animal");
    }
}

public class ProtectedMethod extends Animal {

    public static void main(String[] args) {
        ProtectedMethod dog = new ProtectedMethod();
        dog.display();
    }
}