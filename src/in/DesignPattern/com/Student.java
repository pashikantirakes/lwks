package in.DesignPattern.com;


//Builder Design Pattern  
//create class
public class Student {

	private int id;
	private String name;
	private int age;
    private String active;
	
	private int joinDate;
	private double sal;
	private String dept;
	
	//Select Getters
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getActive() {
		return active;
	}
	public int getJoinDate() {
		return joinDate;
	}
	public double getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	//create private Constructor
	private Student(StudentBuilder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.active = builder.active;
		this.joinDate = builder.joinDate;
		this.sal = builder.sal;
		this.dept = builder.dept;
	}
	
	//Student string builder class
	public static class StudentBuilder{
		private int id;
		private String name;
		private int age;
	    private String active;
		
		private int joinDate;
		private double sal;
		private String dept;
		
		//Create required fields Construtor
		public  StudentBuilder(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		//create other fields setter methods
		public StudentBuilder setActive(String active) {
			this.active=active;
			return this;
		}
		
		public StudentBuilder setJoinDate(int joinDate) {
			this.joinDate=joinDate;
			return this;
		}
		public StudentBuilder setSal(double sal) {
			this.sal=sal;
			return this;
		}
		public StudentBuilder setDept(String dept) {
			this.dept=dept;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", joinDate=" + joinDate
				+ ", sal=" + sal + ", dept=" + dept + "]";
	}
	

   
	
	
}
