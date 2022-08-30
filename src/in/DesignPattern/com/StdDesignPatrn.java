package in.DesignPattern.com;

public class StdDesignPatrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student.StudentBuilder(12, "naresh", 24)
				      .setActive("active")
				      .setDept("ece")
				      .setJoinDate(2020)
				      .setSal(2345.0)
				      .build();
		System.out.println(s1);
				}

}
