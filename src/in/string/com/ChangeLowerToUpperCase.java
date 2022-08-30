package in.string.com;

public class ChangeLowerToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Name is RAkesH";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				//convert it into UpperCase
				
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}else {
				if(Character.isUpperCase(str.charAt(i))) {
					sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
			}
		}
    System.out.println("String after Converssion - " + sb);
    
    
	}

}
