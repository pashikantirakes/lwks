package in.string.com;

import java.util.HashSet;
import java.util.Set;

public class LongestNonrepeatSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdabcdadnc";
		int len=lengthOfLongestSubString(s);
		System.out.println(len);
		
	}

	private static int lengthOfLongestSubString(String s) {

		int i=0,j=0;
		int maxCont=0;
		int strLen=s.length();
		Set<Character> st=new HashSet<>();
		while(i<strLen && j<strLen) {
			if(!st.contains(s.charAt(j))) {
				st.add(s.charAt(j));
				j++;
				maxCont=Math.max(maxCont, j-i);
			}else {
				st.remove(s.charAt(i));
				i++;
			}
		}
		return maxCont;
	}

}
