package in.string.com;

public class PalindromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="My name is nitin and i malayalam";
String[] words=input.split(" ");
for(String s : words) {
	if(isPalin(s)) {
		System.out.println("Ok-" + s);
	}
}

	}

	private static boolean isPalin(String input) {

		int i1=0;
		int i2=input.length()-1;
		while(i2>i1) {
			if(input.charAt(i1) != input.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;
	}

}
