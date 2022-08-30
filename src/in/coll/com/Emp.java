package in.coll.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Emp {

	int id;
	String name;
    String course;
    double salary;
	public Emp(int id, String name, String course, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", course=" + course + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> e=Arrays.asList(
				    new Emp(12,"Rak","ece",6789.0),
				    new Emp(5,"Sun","eee",89897.0),
				    new Emp(5,"Sun","eee",123447.0),
				    new Emp(5,"mon","eee",495807.0)


				);
		Map<String,Emp> mp=e.stream().collect(Collectors
				.groupingBy(Emp::getCourse,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)),Optional::get)));

		System.out.println(mp);
		
		double d=e.stream().filter(e1->e1.getName().equalsIgnoreCase("sun")).map(s->s.getSalary())
		   .mapToDouble(i->i).average().getAsDouble();
		System.out.println(d);
	}

}
