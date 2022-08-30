package in.number.com;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num % i==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println("Prime number - "+ num);
				}else {
					System.out.println("Not");
				
			}
			
		}else {
			System.out.println("Not a prime");
		}

		
		int no=19;
		boolean prime=true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				prime=false;
				break;
			}
		}
		System.out.println(prime);
	}

}
