package in.javaeight.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String mesaage);
}

//.Mehod ref.Using Static method Ex
public class MethodRef {
	
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	public static int addition(int a,int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Class::staticMethod
Function<Integer,Double> fn=(inp)->Math.sqrt(inp);
System.out.println(fn.apply(45));


//Using method.Ref
Function<Integer,Double> fn1=Math::sqrt;
System.out.println(fn1.apply(100));


//Using Lamda Expression calling static method
BiFunction<Integer, Integer, Integer> bifn=(a,b)->MethodRef.addition(a,b);
System.out.println(bifn.apply(45, 898));

//Using Method ref(Call static method)
BiFunction<Integer, Integer, Integer> bifn1=MethodRef::addition;
System.out.println(bifn1.apply(23, 76543));

//__________________________________________________________________________

//2.Ref.to an instance method of a particular Object Object::instanceMethod
  //first create 1 fn.If
MethodRef m=new MethodRef();
//Lamda exp to implement fn.If

Printable p=(msg)->m.display(msg);
p.print("Hfwo mspo");

//using m.ref
Printable p1=m::display;
p1.print("hrld kdnwdi");

//__________________________________________________________________________

//3.Ref.to an instance method of a particular Object of specific type Class::instanceMethod

Function<String, String> fn2=(input)->input.toLowerCase();
System.out.println(fn2.apply("RAKESH PASIKANTI"));

//using method ref.
Function<String, String> f3=String::toLowerCase;
System.out.println(f3.apply("NNFOI DNIDJAEIPJD"));

//Another Ex . 
String[] ar= {"A","E","I","O","U","a","e","i","o","u"};
//Using Lambdaa

Arrays.sort(ar,(s1,s2)->s1.compareToIgnoreCase(s2));
// replace L-exp with method ref
Arrays.sort(ar,String::compareToIgnoreCase);

//__________________________________________________________________________
 
//4. Using Constructor

List<String> fruit=new ArrayList<>();
fruit.add("apple");
fruit.add("banana");
fruit.add("mango");
fruit.add("sabe");

//convert List-> set

Function<List<String>,Set<String>> st=(fruitlist)->new HashSet<>(fruitlist);
System.out.println(st.apply(fruit));

//Convert this L-exp into Method Ref

Function<List<String>,Set<String>> st1=HashSet::new;
System.out.println(st1.apply(fruit));

	}

}
