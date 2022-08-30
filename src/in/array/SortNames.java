package in.array.com;

import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		String names[]=new String[n];
		System.out.println("Enter names:"); 
		for(int i=0;i<n;i++) {
			names[i]=sc1.nextLine();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(String name : names) {
			System.out.println("Sorting Array : "+name );
			//System.out.println(name);
		}

	}

}
