package in.number.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstAndSecondHighNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Java-8
  List<Integer> l=Arrays.asList(12,23,4,653,245,6,321,54,98);
 Integer res= l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(res);
	
	// Normal method
	int[] a={12,443,864,652,872,76,537};
    int f=0,s=0;
    for(int i=0;i<a.length;i++) {
    	if(f<a[i]) {
    		s=f;
    		f=a[i];
    	}else {
    		if(s<a[i]) {
    			s=a[i];
    		}
    	}
    }
    System.out.println(f+"-"+s);
	
	}

}
