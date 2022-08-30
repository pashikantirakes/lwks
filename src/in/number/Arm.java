package in.number.com;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int sum=0,digit;
		while(num>0) {
			digit=num%10;
			sum+=(digit*digit*digit);
		    num=num/10;
		}
		if(temp==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
