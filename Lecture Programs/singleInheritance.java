class parent {
    protected int age = 10;

    void p_name() {
        System.out.println("Rahul p_name");
    }
};

class child extends parent {
    int age = 100;

    void c_name() {
        System.out.println("Rohit c_name");
    }

    void calc_diff() {
        System.out.println(super.age * 2);
    }

};

class grand_child extends parent,child
{
    
};

    public class singleInheritance {

        public static void main(String[] args) {
            child c1 = new child();
            c1.p_name();
            c1.calc_diff();

        }
}
