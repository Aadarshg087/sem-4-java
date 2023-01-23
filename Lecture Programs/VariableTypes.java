class Local {
    public void pupAge() {
        // local variable must be initialised
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }

}

public class VariableTypes {
    public static void main(String[] args) {
        Local local = new Local();
        local.pupAge();
    }
}
