public class JoinThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter("Spain"));
        Thread t2 = new Thread(new Counter("UAE"));
        System.out.println("t1 before start t1.isAlive(): " + t1.isAlive());
        System.out.println("t2 before start t1.isAlive(): " + t1.isAlive());
        t1.start();
        t2.start();
        System.out.println("Started t1 and t2 threads");
        System.out.println("t1 after start t1.isAlive(): ")+ t1.isAlive();
        t2.join();
    }
}
