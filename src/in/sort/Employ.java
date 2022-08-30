package in.sort.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employ {

	int id;
	String name;
	String city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

		public Employ(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", city=" + city + "]";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employ> l=Arrays.asList(
				   new Employ(22,"Dharmsh","mumbai"),
				   new Employ(13,"Salman","pune"),
				   new Employ(84,"Dulkar","kerala"),
				   new Employ(55,"Surya","tamil"),
				   new Employ(6,"Yash","kannada")
				   );
		
		System.out.println("before Sort");
		//l.forEach(s->System.out.println(s.getName() + " - " + s.getCity()));

		System.out.println("------After Sort-----");
		l.sort(Comparator.comparing(Employ::getName));
		l.forEach(s->System.out.println(s.getName() + " - " + s.getCity()));
		System.out.println("---Rev Sort----");
		l.sort(Comparator.comparing(Employ::getName).reversed());
		l.forEach(s->System.out.println(s.getName() + " - " + s.getCity()));

		System.out.println("________Compare City and Sort__________");
		Comparator<Employ> cmp=Comparator.comparing(Employ::getCity).thenComparing(Employ::getName);
		l.sort(cmp);
		l.forEach(r->System.out.println(r.getCity() + " - " + r.getName()));

		
	}

}
