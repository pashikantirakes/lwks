package in.array.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] col= {"red","black","grey"};
		//System.out.println(col.toString());
		List l=Arrays.asList(col);
		System.out.println(l);
		
		List<String> str=new ArrayList<>();
		Collections.addAll(str, col);
		System.out.println(str);
		
//		int i=1;
//		int j=1;
//		while(i<=5) {
//			while(j<=13) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
	}

}
