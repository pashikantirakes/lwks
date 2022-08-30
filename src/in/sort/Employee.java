package in.sort.com;


public class Employee {

	private String name;
	private int id;
	private int age;
	private Address address;
	
	public Employee(String name,int id,int age,Address address) {
		super();
		this.name=name;
		this.id=id;
		this.age=age;
		this.address=address;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
public void setId(int id) {
	this.id=id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address=address;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + "]";
}
}
