package in.java.com;

public class StaticExStu {
	int no;
	String name;
	static String school="ARTI";
	static void change() {
		school="kamala";
	}
	
	StaticExStu(int no,String name){
		this.no=no;
		this.name=name;
	}
	
	
	public void display() {
		System.out.println( no + " - " + name + " - " + school);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticExStu.change();
		StaticExStu s1=new StaticExStu(12,"vs");
        s1.display();
		StaticExStu s2=new StaticExStu(14,"ioes");
		s2.display();

	}

}
