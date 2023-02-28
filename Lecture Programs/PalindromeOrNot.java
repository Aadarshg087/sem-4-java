public class PalindromeOrNot {
    // public static void PalindromeCheck(StringBuilder sb) {
    // StringBuilder sb2 = new StringBuilder(sb.reverse());
    // System.out.println(sb2);
    // if (sb.equals(sb2)) {
    // System.out.println("Palindrome");
    // } else {
    // System.out.println("not Palindrome");
    // }
    // }

    public static void PalindromeCheck2(StringBuilder s1) {
        int l = s1.length();
        int m = 0;
        int n = l;
        while (m <= l / 2 && n > l / 2) {
            if (s1.charAt(m) != s1.charAt(n)) {
                System.out.println("Not Palindrome");
                return;
            }
            m++;
            n--;
        }
        System.out.println("Palindrome");
        return;

    }

    public static void main(String[] args) {
        // Caution Command Line Arguments
        StringBuilder sb = new StringBuilder(args[0]);
        PalindromeCheck2(sb);
    }
}
