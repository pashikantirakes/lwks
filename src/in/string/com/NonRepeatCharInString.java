package in.string.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbcddeef";
		nonRepeat(s);

	}

	private static void nonRepeat(String s) {
     for(int i=0;i<s.length();i++) {
    	 boolean uniq=true;
    	 for(int j=0;j<s.length();j++) {
    		 if(i!=j && s.charAt(i) == s.charAt(j)) {
    			 uniq=false;
    			 break;
    		 }
    	 }
    	 if(uniq) {
    		 System.out.println(s.charAt(i));
    		 break;
    	 }
     }
     Map<Character,Integer> m=new HashMap<>();
     for(int i=0;i<s.length();i++) {
    	 char ch=s.charAt(i);
    	 if(m.containsKey(ch)) {
    		 m.put(ch, m.get(ch)+1);
    	 }else {
    		 m.put(ch, 1);
    	 }
     }
     System.out.println(m);
     for(Entry<Character,Integer> entry: m.entrySet()) {
    	 if(entry.getValue()==1) {
    		 System.out.println("Non Repeated Char : " + entry.getKey());
    	 }
     }
		
	}

}
