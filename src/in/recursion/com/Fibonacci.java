package in.recursion.com;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib(8));
	}

	public static int fib(int num) {
		if(num==0) {
			return 0;
		}if(num==1) {
			return 1;
		}else {
			return fib(num-1)+fib(num-2);
		}
	}
}
