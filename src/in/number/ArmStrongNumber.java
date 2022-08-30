package in.number.com;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;//1634;
      if(isArm(input)) {
    	  System.out.println("Arm");
      }else {
    	  System.out.println("Not");
      }
		System.out.println(countNum(input));
	}
	public static boolean isArm(int input) {
		int j=input;
		int sum=0;
		int digit=0;
		int numberOfDigit=countNum(input);
		while(j>0) {
			digit=j%10;
			j=j/10;
			//sum=sum+digit*digit*digit;
			sum=sum+(int)Math.pow(digit, numberOfDigit);
		}
		
		
		return input==sum;
		
	}
	public static int countNum(int input) {
		int count=0;
	
		while(input>0) {
			input=input/10;
			count++;
		}
		return count;
	}

}
