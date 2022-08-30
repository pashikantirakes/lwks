
package in.array.com;

import java.util.Scanner;

public class InsertEleSpecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
       System.out.println("Entere ele..");
         for(int i=0;i<arr.length-1;i++) {
        	 arr[i]=sc.nextInt();
         }
         System.out.println("Printin before insert..");
         for(int i=0;i<arr.length;i++) {
        	 System.out.println(arr[i]);
         }
         
         System.out.println("Enter localtion");
         int loc=sc.nextInt();
         
         System.out.println("Enter the value..");
         int val=sc.nextInt();
         
         for(int i=arr.length-1;i>loc;i--) {
        	 arr[i]=arr[i-1];
         }
         arr[loc]=val;
         for(int i : arr) {
        	 System.out.println(i);
         }
	}

}
