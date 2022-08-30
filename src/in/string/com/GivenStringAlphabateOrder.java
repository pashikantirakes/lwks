package in.string.com;

import java.util.Arrays;

public class GivenStringAlphabateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="Pashikanti rkesh";
		char temp;
		char[] ch=inp.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		System.out.println(new String(ch));

		Arrays.sort(ch);
		System.out.println(new String(ch));
	}

}
