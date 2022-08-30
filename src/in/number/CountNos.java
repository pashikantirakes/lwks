package in.number.com;

public class CountNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456789;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
