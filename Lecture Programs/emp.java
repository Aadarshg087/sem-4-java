class emp {
    int emp_id;
    int ph_no;
    String name;

    public void get() {
        System.out.println(emp_id);
        System.out.println(ph_no);
        System.out.println(name);
    }

    public static void main(String[] args) {
        emp1 e = new emp1(64231, 827939209, "Hemanth");
        e.get();

    }
}

class emp1 extends emp {
    int emp_id;
    int ph_no;
    String name;

    public emp1(int emp_id, int ph_no, String name) {
        this.emp_id = emp_id;
        this.ph_no = ph_no;
        this.name = name;
        super.emp_id = emp_id;
        super.ph_no = ph_no;
        super.name = name;
    }

    public void get() {
        System.out.println(emp_id);
        System.out.println(ph_no);
        System.out.println(name);
    }
}
