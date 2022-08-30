package in.string.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WithOutDupString {
  //Dup String is not print
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> s=Arrays.asList("rak","esh","josh","esh","kal","yan","kal");
	Set<String> set=new HashSet<>(s);
	for(String sr : set) {
		if(set.add(sr)==false) {
			System.out.println(sr);
		}
	}
Map<String, Long> m=s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//m.forEach((k,v)->System.out.println(k+"-"+v));
//System.out.println(m);
	}

}
