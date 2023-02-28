public class builder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // Default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // Now 16
        sb.append("is my favourite language");
        System.out.println(sb.capacity()); // Now (16*2)+2=34 i.e (old capacity*2)+2
        sb.append(" Java is my favourite language");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
