package in.streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cspf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // predicate();
		//function();
		//consumer();
		supplier();
	}

	private static void supplier() {
		// TODO Auto-generated method stub
		Supplier<Double> db=()->Math.random();
		System.out.println(db.get());
		
		DoubleSupplier d=Math::random;
		System.out.println(d.getAsDouble());
	}

	private static void consumer() {
		// TODO Auto-generated method stub

		Consumer<String> printNames= t->System.out.println(t);
		Stream<String> cities=Stream.of("ads","fnir","fieo","gioonr","giio3a");
		cities.forEach(printNames);
		
	}

	private static void function() {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("rama","ravi","ramesh","nagin","josh","vinnu");
      Function<String,Integer> fn=String::length;
      List<Integer> num=names.stream().map(fn).collect(Collectors.toList());
      System.out.println(num);
	}

	private static void predicate() {
List<String> names=Arrays.asList("rama","ravi","ramesh","nagin","josh","vinnu");
Predicate<String> pt=na->na.startsWith("r");
names.stream().filter(pt).forEach(System.out::println);
	}

}
