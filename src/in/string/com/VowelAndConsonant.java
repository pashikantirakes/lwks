package in.string.com;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is khan";
		int vowel=0;
		int conso=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowel++;
			}else {
				if(s.charAt(i)>'a' && s.charAt(i)<'z') {
					conso++;
				}
			}
		}
System.out.println("Vowel - " + vowel);
System.out.println("Consonant- " + conso);


//with java-8
String str="Hello How are you";
long count=str.chars().filter((x)->{
	return (x=='a' || x=='e'|| x=='i' || x=='o' || x=='u'); //Count of vowels.........
			
}).count();
System.out.println("Vowels : " + count);
Map<String,Long> l=str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
 //Duplicate Chars........
//System.out.println(l);
l.forEach((k,v)->System.out.println(k +" -" + v));
	}

}
