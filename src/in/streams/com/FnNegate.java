package in.streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FnNegate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> f=x->x.length();
		System.out.println(f.apply("Rakesh nfeifjewijfp"));
		//chaining function
		Function<Integer,Integer> f1=x->x*3;
	int len=f.andThen(f1).apply("eefewfmpe");
	System.out.println(len);
	
	Predicate<Integer> func=i->i>55;
	List<Integer> l=Arrays.asList(3,4,78,89,45,62,75);
	List<Integer> ll=l.stream().filter(func).collect(Collectors.toList());
	System.out.println(ll);
	
	//predicate with negate--it will delete 
	
	List<String> names=Arrays.asList("Rak","Rakesh","Rock","Rakkesh","Jva");
	Predicate<String> nam=x->x.startsWith("Ra");
	List<String> n=names.stream().filter(nam.negate()).collect(Collectors.toList());
	System.out.println(n);
	
	//Infinite Streams are generate infinite streams of data
	
	List<Integer> no=IntStream.iterate(0,nu->nu+5).mapToObj(Integer::valueOf).limit(15).collect(Collectors.toList());
	System.out.println(no);
	List<Integer> nom=Stream.generate(()->(new Random()).nextInt(45)).limit(10).collect(Collectors.toList());
	System.out.println(nom);
	}

}
