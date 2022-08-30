package in.string.com;

public class StringRotationEachOther {

	public static void main(String[] args) {
	System.out.println(isRotate("abcd","bcda"));
	
	
	}
	public static boolean isRotate(String str,String rotate) {
	  if(str==null || rotate == null) {
		  return false;
	  }else if(str.length() != rotate.length()) {
		  return false;
	  }else {
		  String concat=str+str;
		  return concat.contains(rotate);
	  }
		
		
	}

}
