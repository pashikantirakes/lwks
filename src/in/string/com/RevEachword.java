package in.string.com;

public class RevEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="who are you";
		String result=" ";
		String[] str=s.split("//s");
		//System.out.println(str);
		for(String word : str) {
			//System.out.println(word);
			String rev="";
			int j=word.length()-1;
			while(j>=0) {
				char ch=word.charAt(j);
				rev=rev+ch;
				j--;
			}
			result=result+rev+"";
		}
System.out.println(result);


String str1="Java code Better";
System.out.println("Original String " + str1);
String op="";
String[] words=str1.split(" ");

for(String word : words){
	String rev="";
	for(int i=word.length()-1;i>=0;i--){
		rev=rev+word.charAt(i);
		 
	 }
	op=op + rev + " ";
}
System.out.println("Reversed String --  " + op);
	}

}
