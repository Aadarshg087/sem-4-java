import java.security.MessageDigest;
import java.text.DecimalFormat;

public class operationsInterface {
    interface Operation1 {
        int operation(int a, int b);
    }

    interface Operation2 {
        String Message(int num);
    }

    private int operate(int P, int Q, Operation1 Obj) {
        return Obj.operation(P, Q);
    }

    private String operate1(int num, Operation2 str) {
        return str.Message(message1);
    }

    public static void main(String[] args) {

        Operation1 Add = (int x, int y) -> x + y;
        Operation1 Mult = (int x, int y) -> x * y;
        Operation1 Divide = (int x, int y) -> x / y;
        Operation1 subtract = (int x, int y) -> x - y;
        Operation2 str = (int num) -> {
            Integer.toString(num);
        };
        operationsInterface Tobj = new operationsInterface();
        System.out.println("Addition is: " + Tobj.operate(600, 700, Add));
        System.out.println("Multiplication is: " + Tobj.operate(60, 30, Mult));
        System.out.println("Division is: " + Tobj.operate(60, 30, Divide));
        System.out.println("Subtraction is: " + Tobj.operate(60, 30, subtract));
        System.out.println("String message method: " + Tobj.operate1(Add, str));

    }
}
