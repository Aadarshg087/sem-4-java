class Marks {
    int phyMarks;
    int mathsMarks;
    int engMarks;
}

class MarksDemo {
    public static void main(String[] args) {
        Marks obj1 = new Marks();
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;

        Marks obj2 = new Marks();
        obj2.engMarks = 80;
        obj2.mathsMarks = 60;
        obj2.phyMarks = 85;

        System.out.println("Marks for first object: ");
        System.out.println(obj1.engMarks); // Automatically initialized by zero
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);

        System.out.println("Marks for second object: ");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);
        System.out.println(obj2.phyMarks);

    }
}
