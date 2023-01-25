public class Inst {

    public static void main(String[] args) {
        String name = "Pramod ";
        boolean result1 = name instanceof String;
        System.out.println("Name is an instance of string :" + result1);
        Inst onj =new Inst();

        boolean result2 =onj instanceof Inst;
        System.out.println("onj is an instacnce of Inst"+ onj);
        
    }
}
