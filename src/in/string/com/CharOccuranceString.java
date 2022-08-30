package in.string.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
checkFreq(s);
sc.close();

//_________________________________________

		String str="My name is Rakesh";
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}else {
				m.put(ch,1);
			}
		}
		System.out.println(m);
		
		String s1="My name is rakesh";
		//String org=s1.toLowerCase();
		int len=s1.length();
		String res=s1.replaceAll("a", "");//int rem=s.replaceAll("a","").length();
		int len2=res.length();
		int count=len-len2;  //int cnt=len-rem;
		System.out.println("char repeates " + count + " times");
	}

	private static void checkFreq(String s) {
//		// TODO Auto-generated method stub
//		Map<String,Integer> mp=new HashMap<>();
//char[] h=s.toCharArray();
//for(char i : h) {
//	if(Character.isLetter(i)) {
//		if(mp.containsKey(i)) {
//			mp.put(i, mp.get(i)+1);
//		}else {
//			mp.put(i,1);
//		}
		
//	}
//}
		
		
		char[] ch=s.toCharArray();
	       Map<Character,Integer> m=new HashMap<>();
	       for(char c : ch) {
	    	   if(Character.isLetter(c)) {
	    		   if(m.containsKey(c)) {
	    			   m.put(c, m.get(c)+1);
	    		   }else {
	    			   m.put(c,1);
	    		   }
	    	   }
	       }
	       for(Map.Entry entry: m.entrySet()) {
	    	   System.out.println(entry.getKey() + " - " + entry.getValue());
	       }
		
	}

}
