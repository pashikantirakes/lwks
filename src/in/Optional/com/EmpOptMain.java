package in.Optional.com;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EmpOptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(12,"r",null,4667);
		Employee e1=new Employee(23, "ravi", "viazag", 23456);
		
		Optional<Object> o=Optional.empty();
		System.out.println(o);
		
		Optional<Object> opt=Optional.of(e.getName());
		System.out.println(opt);
		
		Optional<String>s1=Optional.ofNullable(e.getCity());
		System.out.println(s1);
		
		
		
		
		
		
		
		//Optional<Object> emp=Optional.empty();
		//System.out.println(emp);
		String r="null@mail.com";
		//
		// of() is null check 
		//if given arg is null it will give NPE
		//Optional<String> opt=Optional.of(r);
		//System.out.println(opt.get());
		//


		// if given arg is null it won't give NPE it gives Optional.empty as a result 

		Optional<String> ofn=Optional.ofNullable(r);
		//if(ofn.isPresent()) {
//			System.out.println(ofn.get());
		//}else {
//			System.out.println("No");
		//}

		String def=ofn.orElse("nfrinrl");
		System.out.println(def);

		String s=ofn.orElseGet(()->"nie@gmial.com");
		System.out.println(s);
		String st=ofn.orElseThrow(()-> new IllegalArgumentException("No method"));
		System.out.println(st);

		String resu="abc";
		if(resu != null && resu.contains("abc")) {
			System.out.println(resu);
		}
//		Optional<String> gst=Optional.of(resu);
//		gst.filter(e->e.contains("abc"))
//		           .map(String::trim).ifPresent((e)->System.out.println(e));

		//MethodRef.Ex

		//Using L-Exp
		Function<Integer,Double> mr=(input)->Math.sqrt(input);
		System.out.println(mr.apply(33));

		//using MethodRef.
		Function<Integer,Double> mr1=Math::sqrt;
		System.out.println(mr1.apply(25));

		//Using lambda
		BiFunction<Integer, Integer, Integer> bi1=(a,b)->EmpOptMain.add(a,b);
		System.out.println(bi1.apply(12, 13));
			
		//Using met.ref
			BiFunction<Integer, Integer, Integer> bi11=EmpOptMain::add;
			System.out.println(bi11.apply(2, 3));
			
			//2 .Method Ref using instance method
			}
			
			
			public static int add(int a,int b) {
				return (a+b);
			}
			@FunctionalInterface
			interface P{
				void print(String msg);

	}

}
