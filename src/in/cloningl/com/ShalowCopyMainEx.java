package in.cloningl.com;

public class ShalowCopyMainEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address a1=new Address("Nawbpeat","chityal");
		Employee e1=new Employee(12,"rakesh",4567.0,a1);
		//System.out.println(e1);
		Employee e2=(Employee) e1.clone();
		System.out.println(e2);
		
		e1.getAddr().setMdl("MGPL");
		System.out.println(e1);
		//Employee e2=(Employee) e1.clone();
		System.out.println(e2);
		//System.out.println(e2);

	}

}
