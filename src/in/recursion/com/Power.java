package in.recursion.com;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,4));

	}
	public static int power(int base,int num) {
		if(num == 1) {
			return base;
		}else {
			return base * power(base,num-1);
		}
}
}
