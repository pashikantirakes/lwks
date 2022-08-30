package in.number.com;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int fact=1;
//		for(int i=1;i<=num;i++) {
//			fact=fact*i;
//		}
//		//System.out.println(fact);
		
		for(int j=num;j>=1;j--) {
			fact=fact*j;
		}
		System.out.println(fact);
	}

}
