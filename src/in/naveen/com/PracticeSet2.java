package in.naveen.com;

public class PracticeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* double num=45.f;
        if(num<0.0){
        	System.out.println("It is negative");
        }else if(num>0.0){
        	System.out.println("It is Positive"); //(11)Given no is  +ve or -ve
        }else{
        	System.out.println("It is 0");
        }*/
		/* char c='(';
		if( (c>='a' && c<='z')|| (c>='A' && c<='Z')){
			System.out.println(c + " It is Alphabeat"); (12) Alphabeat or not
		}else{
			System.out.println(c+"It is not Alphabeat");
		} */
		
		/*int num=10;
		int sum=0;
		for(int i=1;i<=num;i++){  //(12) Sum of natural numbers..(1+2+3+...n)
			sum=sum+i;
		}
		System.out.println("Sum is :" + sum);
		 int sum1=0;
		 int k=1;
		 while(k<=num){    //Sum of natural numbers using while loop..(1+2+3+...n)
			 sum1=sum1+k;
			 k++;
		 }
		 System.out.println("Sum is :" + sum);*/
		int num=0;
		getFact(num);
	}	
	public static void getFact(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("Result is : " + fact); //(13) Factorial of given number..
		
	  int m1=267;
	  for(int i=1;i<=10;i++){
		  System.out.println(m1 + "x" + i + "=" +(m1*i)); // (14) Multiplication of Table...
	  }
	  for(char c='A';c<='Z';c++){
		  System.out.println(" "+ c);// (15) Print Alphabets
	  }
	  long num1=234556789;
	  int count=0;
	  while(num1 !=0){
		  num1=num1/10;
		  count++;
	  }
	  System.out.println(count);//(16) print no of digits
	   
	  int no=12345;
	  int rev=0;
	  while(num!=0){
		  int n=no%10;
		  rev=rev*10+n;
		  no=no/10;
		 
	  }
	  System.out.println(rev);
	}

}
