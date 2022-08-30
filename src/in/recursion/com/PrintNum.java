package in.recursion.com;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num(7);

	}
	public static void num(int num) {
		if(num == 0) {
			return;
		}else {
			System.out.println(num);
			num(num-1);
		}
	}

}
