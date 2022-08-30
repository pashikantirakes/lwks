package in.javaeight.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//import in.rakesh.com.Employee;

public class EmpJavaTechie {
	//static List<Emp> l=new ArrayList<>();
	public static void main(String[] args) {
		List<Emp> l=Arrays.asList(
				//ls.add(new Employee(12,"rakesh","M",27,"wgl",4567,2022,"dev"));
				new Emp(12, "Rakesh", 26, "male", "ece", 2022, 35000.0),
				new Emp(22, "Mukesh", 18, "male", "cse", 2018, 34730.0),
				new Emp(34, "Rashmika", 26, "female", "eee", 2016, 47300.0),
				new Emp(53, "Monu", 20, "male", "mpc", 2020, 6700.0),
				new Emp(19, "sarala", 22, "female", "ece", 2022, 64000.0),
				new Emp(8, "shweta", 28, "female", "cse", 2016,27860.0),
				new Emp(45, "Janahit", 8, "male", "eee", 2022, 4378.0),
				new Emp(10, "Lallu", 28, "male", "ece", 2021, 35000.0)
				);
		//1.How many male & females in org
	Map<String,Long> maf=l.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
	System.out.println("1.Male and Females - " + maf);
	
	
	//2.Print all dept
	System.out.println("2.Print all Dept Names: ");
	l.stream().map(e->e.getDept()).distinct().forEach(System.out::println);
	
	
	//3.Avg age of male and female
	Map<String, Double> avg=l.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingInt(Emp::getAge)));
	System.out.println("3.Avg age of male and female : " + avg);
	
	
	//4.High paid emp
Optional<Emp>opt=l.stream().max(Comparator.comparing(Emp::getSalary));
System.out.println("4.High paid Emp name : " + opt.get().getName());
Optional<Emp>pd=l.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));
 System.out.println("Paid " + pd.get());
 
 //5.Afte 2020
 System.out.println("5.After 2020 who joined in org..");
 l.stream().filter(e->e.getDateOfJoin()>2020).map(Emp::getName).forEach(System.out::println);
 
 //6.count in each dept
 System.out.println("6.Each Dept Emp ");
  Map<String,Long> count=l.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.counting()));
  //System.out.println("6.Total no of emp " + count);
  Set<Entry<String,Long>> ent = count.entrySet();
  
  for(Entry<String,Long> entry : ent) {
	  System.out.println( entry.getKey() + " - " + entry.getValue());
  }
  
  //
  System.out.println("7.Avg salary of Each Dept--");
  Map<String,Double> avgs=l.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.averagingDouble(Emp::getSalary)));
  Set<Entry<String,Double>> st=avgs.entrySet();
  for(Entry<String,Double> entry : st) {
	  System.out.println(entry.getKey() + " - " + entry.getValue());
  }
	  System.out.println( " 8.Young Male Emp in Ece");
	Optional<Emp> oe=l.stream().filter(e->e.getGender()=="male" && e.getDept()=="ece").min(Comparator.comparing(Emp::getAge));
	  System.out.println("ID - " +oe.get().getId());
	System.out.println("NAME - " +oe.get().getName());
	
	System.out.println("9.Most Working Exp.. ");
	Optional<Emp> yoj= l.stream().sorted(Comparator.comparing(Emp::getDateOfJoin)).findFirst();
	System.out.println("ID - " +yoj.get().getId());
	System.out.println("NAME - " +yoj.get().getName());
	
	System.out.println("10.How many emp are in cse");
	Map<String,Long> gen= l.stream().filter(e->e.getDept()=="cse").collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
         System.out.println(gen);
	
	System.out.println("11.Avg salary of emp - ");
	Map<String,Double> as=l.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.averagingDouble(Emp::getSalary)));
	System.out.println(as);
	
	System.out.println("12.All Emp.in each Dept");
	Map<String,List<Emp>> list=l.stream().collect(Collectors.groupingBy(Emp::getDept));
	Set<Entry<String,List<Emp>>> st1=list.entrySet();
	for(Entry<String,List<Emp>> entr : st1) {
		System.out.println("Employees in - " + entr.getKey());
		List<Emp> lt=entr.getValue();
		for(Emp pme : lt) {
			System.out.println(pme.getName());
		}
	}
	
	System.out.println("13.Avg salry & total sal of dept");
	DoubleSummaryStatistics ds=l.stream().collect(Collectors.summarizingDouble(Emp::getSalary));
	System.out.println("Total Salary of all Dept - " + ds.getSum());
	System.out.println("Average Salary of all Dept - " + ds.getAverage());
	
	System.out.println("14.seperate emp equal 20 years from those emp who is elder-");
Map<Boolean,List<Emp>>bo=l.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
Set<Entry<Boolean,List<Emp>>> boo=bo.entrySet();
for(Entry<Boolean,List<Emp>> entry : boo) {
	if(entry.getKey()) {
		System.out.println("Employees older than 25");
	}else {
		System.out.println("Emp younger than 25");
	}
	List<Emp> lt=entry.getValue();
	for(Emp p : lt) {
		System.out.println(p.getName());
	}
}
	
	
	System.out.println("15.Oldest Emp ");
Optional<Emp> age=l.stream().max(Comparator.comparing(Emp::getAge));
System.out.println("name-" + age.get().getName());
System.out.println("Age- " + age.get().getAge());
System.out.println("Dept - " + age.get().getDept());

System.out.println("16.From each Dept high Sal ");
Map<String,Emp> empl=l.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors
		.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)), Optional::get)));
//System.out.println(empl);
empl.forEach((k,v)->System.out.println(k+"-"+v));
	}

}
