package in.cloningl.com;

public class Address  {

	private String vname;
	private String mdl;
	public Address(String vname, String mdl) {
		super();
		this.vname = vname;
		this.mdl = mdl;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getMdl() {
		return mdl;
	}
	public void setMdl(String mdl) {
		this.mdl = mdl;
	}
	public String toString() {
		return "Address [vname=" + vname + ", mdl=" + mdl + "]";
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
}
