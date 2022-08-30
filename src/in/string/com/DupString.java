package in.string.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s6=Arrays.asList("hi","ra","hi","how","are","you","and","who","are","you");
		
		Map<String,Long> l=
			s6.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		l.forEach((k,v)->System.out.println(k + " - " + v));
	}

}
