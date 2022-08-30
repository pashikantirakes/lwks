package in.DesignPattern.com;

public class Singleton {
	public static Singleton sin=null;
	public String string;
	//make Constructor as a private

	private Singleton() {
		System.out.println("Constructor is called");
		string="rakesh";
	}
	
	//write a public static method getinstance & return type is obj of this singleton class
	
	public static Singleton getInstance() {
	if(sin==null) {
		sin=new Singleton();
		System.out.println("Singleton is called" +sin);

	}
	return sin;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		System.out.println(x.string);
		System.out.println(y.string);
		System.out.println(z.string);
		System.out.println(z.string.hashCode());
		System.out.println(y.string.hashCode());
		


	}

}
