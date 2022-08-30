package in.streams.com;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input= {"abc","def","ghi","abc"};
		Stream<String> str=Arrays.asList(input).stream();
		//str.forEach(System.out::println);
		//long cnt=str.filter(e->e.equals("abc")).count();     Can not reuse a stream again
		Supplier<Stream<String>> sp=()->Stream.of(input);
		sp.get().forEach(System.out::println);
		long count=sp.get().filter(e->e.equals("abc")).count();
		System.out.println(count);
	}

}
