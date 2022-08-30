package in.string.com;

public class EvenLengthword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello word my name is raesh";
		for(String str : s.split(" ")) {
			if(str.length()%2==0) {
				System.out.println(str);
			}
		}
		
	}

}
