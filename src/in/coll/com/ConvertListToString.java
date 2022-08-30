package in.coll.com;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lm=new ArrayList<>();
		lm.add("hi");
		lm.add("hello");
		lm.add("neneo");
		
	String[]str=lm.toArray(new String[lm.size()]);
	for(String s:str) {
		System.out.println(s);
	}
	
	
	//String[] s=lm.toArray(new String[lm.size()]);
	}

}
