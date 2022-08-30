package in.streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=Stream.of(34,56,76).reduce(0,(a, b)->a+b);
		System.out.println(i);
		
		List<Integer> l=Arrays.asList(1,2,3,5);
		int sum=l.stream().mapToInt(i1->i1).sum();
		System.out.println(sum);
		
		int sum1=l.stream().reduce(2, (a,b)->a*b);
		System.out.println(sum1);
		
		Optional<Integer> opt=l.stream().reduce(Integer::sum);
		System.out.println(opt.get());
		
		Integer max=l.stream().reduce(Integer::max).get();
		System.out.println(max);
		
		List<String> s=Arrays.asList("java","c","spring","python");
String sw=s.stream().reduce((a1,a2)->a1.length()>a2.length() ? a1 : a2).get();
System.out.println(sw);



	}

}
