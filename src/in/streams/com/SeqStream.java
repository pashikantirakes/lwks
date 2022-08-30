package in.streams.com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeqStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream st=Stream.of("rak","josh","naresh","mani");
		st.findAny().ifPresent(System.out::println);
		
		IntStream .range(1, 15).forEach(System.out::println);
		
		//
		Arrays.stream(new int[] {1,2,4,5,7})
		.map(s->s*3+1).
		average().ifPresent(System.out::println);
		//String data obj
		
		Stream.of("a1","a2","a3","h498")
		 .map(s->s.substring(1))
		 .mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		//double to obj
		Stream.of(23.4,54.0,67.4,8676.54)
		.mapToInt(Double::intValue)
		.mapToObj(i->"a"+i).forEach(System.out::println);
		
		//limit
		Stream.iterate(2,n->n+2).limit(15).forEach(System.out::println);
		
		//Odd no.s
		Stream.iterate(0,n->n+1).filter(n->n%2 != 0).limit(7).forEach(System.out::println);
	}

}
