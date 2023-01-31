public class Question_class {
    public static void main(String[] args) {
        float marks1 = Float.parseFloat(args[1]);
        float marks2 = Float.parseFloat(args[2]);
        float marks3 = Float.parseFloat(args[3]);
        float total_marks = marks1 + marks2 + marks3;
        float average_marks = (marks1 + marks2 + marks3) / 3;
        System.out.println("Name = " + args[0]);
        System.out.println("Marks1 = " + args[1]);
        System.out.println("Marks2 = " + args[2]);
        System.out.println("Marks3 = " + args[3]);
        System.out.println("Total Marks = " + total_marks);
        System.out.println("Average Marks = " + average_marks);
        
    }
}
