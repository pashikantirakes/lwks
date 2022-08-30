package in.string.com;

public class SwapWithOutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String f="one";
		String t="two";
		System.out.println("Before " + f + " - " + t);
		f=f+t;
		t=f.substring(0, (f.length()-t.length()));
		f=f.substring(t.length());
		System.out.println("After " + f + " - " + t);
	}

}
