package in.array.com;

import java.util.Scanner;

public class MaxDiffAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of size : ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the ele of array :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		System.out.println("Diff = " + (max-min));
		
	}

}
