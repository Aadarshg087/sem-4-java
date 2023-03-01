public class Account {
    private long acc_no;
    private String name;
    private String email;
    private float amount;

    public (){

    }

    // Set Constructor
    public Account(long acc_no, String name, String email, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    // Copy Constructor
    public Account(Account a) {
        this.acc_no = a.acc_no;
        this.name = a.name;
        this.email = a.email;
        this.amount = a.amount;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void print() {
        System.out.println(acc_no);
        System.out.println(name);
        System.out.println(email);
        System.out.println(amount);
    }

    public static void main(String[] args) {
        Account a1 = new Account(133443312, "India", "jnsdkjsn", 10000);
        Account a2 = new Account(a1);
        a2.print();
    }
}
