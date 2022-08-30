package in.java.com;

public abstract class Bank {
	public abstract void loan();
	public void credit() {
		System.out.println("Credit-Money");
	}
	public void debit() {
		System.out.println("Debt-Money");
	}

}
