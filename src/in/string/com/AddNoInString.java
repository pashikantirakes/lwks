package in.string.com;

public class AddNoInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="nj3m9fek56njo78";
		int length=input.length();
		int tem=0;

		for(int i=0;i<length;i++) {

			char ch=input.charAt(i);
			if(Character.isDigit(ch)) {
				tem=tem+Character.getNumericValue(ch);
			}
		}
System.out.println(tem);
	}

}
