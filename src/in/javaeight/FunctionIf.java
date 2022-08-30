package in.javaeight.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> fn=x->x.length();
		Function<Integer,Integer> fun=x->x*5;
		System.out.println(fn.apply("My name is nienio"));
		System.out.println(fun.apply(25));
		
		BinaryOperator<Integer> bo=(e1,e2)->e1*e2;
		System.out.println(bo.apply(23, 23));
		
		List<String> l=new ArrayList<>();
		l.add("ad");
		l.add("cv");
		l.add("bio");
		System.out.println(l);
		l.replaceAll(ele->ele+"Rakesh");
		System.out.println(l);
		

	}

}
