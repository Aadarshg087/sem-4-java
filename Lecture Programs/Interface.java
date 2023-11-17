interface Greeting {
    String getName(String name);

    int getAge(int age);

    String getGreeting(String name);
}

class A implements Greeting {
    public String getName(String name) {
        return "Name: " + name;
    }

    public int getAge(int age) {
        return age;
    }

    public String getGreeting(String name) {
        return "Hi " + name;
    }

}

class B implements Greeting {

    public String getName(String name) {
        return "Your Name: " + name;
    }

    public int getAge(int age) {
        return age + 1;
    }

    public String getGreeting(String name) {
        return "Hola " + name;
    }
}

public class Interface {

    public static void main(String[] args) {
        Greeting h = new B();
        System.out.println(h.getGreeting("Aadarsh"));
        System.out.println(h.getName("Aadarsh"));
        System.out.println(h.getAge(9));

        Greeting l = new A();
        System.out.println(l.getGreeting("Pramod"));
        System.out.println(l.getName("Pramod"));
        System.out.println(l.getAge(8));

    }
}