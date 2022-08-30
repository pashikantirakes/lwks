package in.immutable.com;

class Engine{
	int speed;
	Engine(int s){
		this.speed=s;
	}
}
public class Immutable {
	private final int id ;
	private final String name;
	private final Engine eng;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Immutable(int id,String name,Engine e) {
		this.id=id;
		this.name=name;
		Engine newE=new Engine(e.speed);
		this.eng=newE;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1=new Engine(567);
		Immutable i=new Immutable(4,"bng",e1);
		System.out.println(i.name=="bng");
		System.out.println(i.eng.speed);
		e1.speed=78;
		System.out.println(i.eng.speed);
	}

}
