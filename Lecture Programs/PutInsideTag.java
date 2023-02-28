public class PutInsideTag {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(args[0]);
        StringBuilder sb2 = new StringBuilder(args[1]);
        int l = sb.length();
        sb.insert(l / 2, sb2);
        System.out.println(sb);
    }
}
