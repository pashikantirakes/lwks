package in.number.com;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
int n=12345;
int digit;
int sum=0;
while(n>0) {
digit=n%10;
sum=sum+digit;
n=n/10;
}
System.out.println("Sum of numbers - " + sum);

    //Given Range 

Scanner sc=new Scanner(System.in);
System.out.println("Enter range");
int no=sc.nextInt();
int smu=0;
for(int i=1;i<=no;i++) {
	smu=smu+i;
}
System.out.println(smu);

     //Adding String

String s1="234";
String s2="6544";
int s=Integer.parseInt(s1)+Integer.parseInt(s2);
System.out.println(s);
	}

}
