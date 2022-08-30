package in.string.com;

public class CountEachCharInWord {
	public static void main(String[] args) {
		String str="Hello worlsd";
		count(str);
	}

	private static void count(String str) {
		//Creating an char array of given string
   char[] ch= str.toCharArray();
   for(int i=0;i<ch.length;i++) {
	   String s="";
	   //when the char is not space
	   while(i<ch.length && ch[i] != ' ') {
		   //concat with the declared string
         s=s+ch[i];
         i++;
	   }
	   if(s.length()>0) {
		   System.out.println(s + " - " + s.length());
	   }
   }
   
   
   //Count each word
   String s="My country name is India";
   int count=1;
   for(int i=0;i<s.length()-1;i++) {
	   if((s.charAt(i)==' ') && (s.charAt(i+1) != ' ')) {
		   count++;
	   }
   }
   System.out.println(count);
		
   
   
   //Count each letter
   String S="I am single";
   int cnt=0;
   for(int i=0;i<S.length();i++) {
	   if(S.charAt(i) != ' ') {
		   cnt++;
	   }
   }
   System.out.println(cnt);
	}

}
