package in.sort.com;

import java.util.Comparator;

public class Address  {

	private String streetName;
	private int pincode;
	
	public Address(String strretName,int pincode) {
		this.streetName=strretName;
		this.pincode=pincode;
	}
	public String getStreetname() {
		return streetName;
	}
	public void setStreetName(String streetName) {
this.streetName=streetName;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}
	public int getPincode() {
		return pincode;
	}
public void setPincode(int pincode) {
	this.pincode=pincode;
}

public int compareTo(Address adr) {
	return this.getPincode()-adr.getPincode();
}
}
