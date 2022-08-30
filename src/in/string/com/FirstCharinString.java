package in.string.com;

public class FirstCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is khan";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			String q=s[i];
			System.out.println(q.charAt(0));
		}

	}

}
