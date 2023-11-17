
interface Car {
    String getName(String name);

    int getSpeed(int speed);

    void applyBreak();

};

class Properties2 extends Car {

}

class Properties implements Car {
    public String getName(String name) {
        return "Hi " + name;
    }

    public int getSpeed(int speed) {
        return speed;
    }

    public void applyBreak() {
        System.out.println("Apply break on: " + getName("Hey"));
    }

}

public class CarProperties {

    public static void main(String[] args) {

    }
}
