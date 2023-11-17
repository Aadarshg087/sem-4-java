import java.util.*;

interface Bank {
	public float Principal = 0;
	public int time = 0;

	public float calculateInterest(float Principal, int time);

};

class SBI implements Bank {
	final float INTEREST_RATE = 10.8f;

	public float calculateInterest(float Principal, int time) {
		float Sinterest = (Principal * INTEREST_RATE * time) / 100;
		return Sinterest;
	}
};

class ICICI implements Bank {
	final float INTEREST_RATE = 11.6f;

	public float calculateInterest(float Principal, int time) {
		float Sinterest = (Principal * INTEREST_RATE * time) / 100;
		return Sinterest;
	}
};

class AXIS implements Bank {
	final float INTEREST_RATE = 12.3f;

	public float calculateInterest(float Principal, int time) {
		float Sinterest = (Principal * INTEREST_RATE * time) / 100;
		return Sinterest;
	}
};

public class InterestDemo {
	public static void main(String Args[]) {
		SBI s = new SBI();
		System.out.println(s.calculateInterest(1000, 5));
		ICICI i = new ICICI();
		System.out.println(i.calculateInterest(1000, 5));
		AXIS a = new AXIS();
		System.out.println(a.calculateInterest(1000, 5));
	}
};
