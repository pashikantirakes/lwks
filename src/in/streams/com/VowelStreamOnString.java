package in.streams.com;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelStreamOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello how are you and where are you";
		long count=str.chars().filter((x)->{
			return (x=='a' || x=='e' || x=='i' || x=='o' || x=='u'); 
					}).count();
		System.out.println("Vowels " +count);
		Map<String,Long> mp=str.chars().mapToObj(x->x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));

	}

}
