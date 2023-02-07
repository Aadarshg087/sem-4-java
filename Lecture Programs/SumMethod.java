public class SumMethod {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
    }

    static public int sum(int[] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        return total;
    }
}
