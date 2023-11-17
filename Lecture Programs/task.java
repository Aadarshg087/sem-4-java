class bank {
    // int ();

    // abstract int getAccountNumber();

}

class icici extends bank {
    int getbalance() {
        return 1000;
    }

    public void getinterest() {
        System.out.println("icici");
    }
}

class pnb extends bank {

    int getbalance() {
        return 2000;
    }

    public void getinterest() {
        System.out.println("pnb");
    }

}

class uboi extends bank {
    int getbalance() {
        return 3000;
    }

    public void getinterest() {
        System.out.println("uboi");
    }

}

class citi extends bank {
    int getbalance() {
        return 4000;
    }

    public void getinterest() {
        System.out.println("citi");
    }

}

abstract class abs extends bank {
    abstract int hello();

}

public class task {
    public static void main(String[] args) {
        bank ic = new icici();
        System.out.println(ic.getbalance());
        bank ub = new uboi();
        System.out.println(ub.getbalance());
        bank ct = new citi();
        System.out.println(ct.getbalance());
        bank pb = new pnb();
        System.out.println(pb.getbalance());
        icici ic1 = new icici();
        ic1.getinterest();
        uboi ub1 = new uboi();
        ub1.getinterest();

    }
}