package in.java.com;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc b=new Hdfc();
		b.credit();
		b.loan();
		b.funds();
		b.debit();
		//Here only call P-type methods
		Bank h=new Hdfc();
		h.credit();
		h.debit();
		h.loan();
		
	}

}
