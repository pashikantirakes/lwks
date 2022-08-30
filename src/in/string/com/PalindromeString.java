package in.string.com;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
String org=sc.nextLine();
String rev="";
for(int i=org.length()-1;i>=0;i--) {
	rev=rev+org.charAt(i);
}
if(org.equalsIgnoreCase(rev)) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not");
}
	}

}
