class Data {
    private String name;

    // These method are used to pass the private variable to the other class
    // getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class PrivateVariable {
    public static void main(String[] args) {
        Data d = new Data();
        d.setName("Priya");
        System.out.println(d.getName());
    }
}
