package in.array.com;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:- ");
		int size=sc.nextInt();
		//Declare the new array with old array size
		int ary[]=new int[size];
		int sum=0;
		System.out.println("enter ele..");
		for(int i=0;i<size;i++) {
			ary[i]=sc.nextInt();
		}
		for(int i=0;i<ary.length;i++) {
			sum+=ary[i];
		}
		System.out.println(sum);
		
	}

}
