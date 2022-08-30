package in.string.com;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
		System.out.println(str.substring(i, j));
			}
		}
		//extract 4 char.
		String s1="www.imn.com";
		String firstFour=s1.substring(0, 4);
		//System.out.println(firstFour);
		String lastFour=s1.substring(s1.length()-4, s1.length());
		//System.out.println(lastFour);
		String web=s1.substring(4,s1.length()-4);
		//System.out.println(web);
		
	}
	

}
