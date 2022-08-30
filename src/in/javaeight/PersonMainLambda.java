package in.javaeight.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class PersonMainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> p=Arrays.asList(
				   new Person("rakesh","paskanti",26),
				   new Person("raj","kokkula",28),
				   new Person("josh","damarashetty",24),
				   new Person("alkil","kokkula",15),
				   new Person("vinayak","karre",12)
				);
		//Using java 7 Sort by last name
		Collections.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		//2.create a method to print list
		printAll(p);

	}

	private static void printAll(List<Person> p) {
       for(Person po : p) {
    	   System.out.println(po);
       }
       //3.create a method to prinnt last name begin with 'k'
       printNamebeginwith(p);
	}

	private static void printNamebeginwith(List<Person> p) {
for(Person las : p) {
	if(las.getLastName().startsWith("k")) {
		System.out.println(las);
	}
}
	}

}
