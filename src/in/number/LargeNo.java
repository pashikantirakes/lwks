package in.number.com;

import java.util.Scanner;

public class LargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		 System.out.println("Enter first number");
		 int n1=s1.nextInt();
		 
		 Scanner s2=new Scanner(System.in);
		 System.out.println("Enter second number");
		 int n2=s2.nextInt();
		 
		 Scanner s3=new Scanner(System.in);
		 System.out.println("Enter third number");
		 int n3=s3.nextInt();
		 
		 if(n1>n2 && n1>n3) {
			 System.out.println("1st no.great ");
		 }
		 else if (n2>n3 && n2 > n1) {
			 System.out.println("2nd great");
		 }
		 else {
			 System.out.println("3rd");
		 }
	}

}
