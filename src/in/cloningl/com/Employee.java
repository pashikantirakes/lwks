package in.cloningl.com;

public class Employee implements Cloneable {

	private int id;
	 private String name;
	 private double fee;
	 private Address addr;
	 
	 
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Employee(int id, String name, double fee, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", fee=" + fee + ", addr=" + addr + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee emp=(Employee)super.clone();
		emp.setAddr(new Address (getAddr().getVname(),getAddr().getMdl()));
		return emp;
	}
}
