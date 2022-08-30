package in.sort.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.sort.com.Address;
import in.sort.com.Employee;
import in.sort.com.AdrComparator;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("rak",38,27,new Address("hyd",38792));
		Employee e2=new Employee("jak",45,54,new Address("sec",8973));
		Employee e3=new Employee("mini",87,33,new Address("wgl",6483));
		Employee e4=new Employee("lucj",5679,12,new Address("cheni",873268));
		
		List<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println(l);
		
		Collections.sort(l,new AgeComp());
		System.out.println("Based on Age " + l);
		
		Collections.sort(l,new NaamComp());
		System.out.println("Based on Name- " + l);
		
		Collections.sort(l,new AdrComparator());
		System.out.println("Address purpose " + l);
		

	}

}
