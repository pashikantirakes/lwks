package in.coll.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<>();
		a1.add("af");
		a1.add("fmeo");
		a1.add("nie");
		a1.add("eoe");
		ArrayList<String> a2=new ArrayList<>();
          a2.add("hello");
          a2.add("amni");
          a2.add("good");
          //a1.addAll(a2);
          //System.out.println(a1);
//          a1.addAll(1, a2);
//          System.out.println(a1);
//          a1.clear();
//          System.out.println(a1);
          
//          ArrayList<String> cl=(ArrayList<String>)a1.clone();
//          System.out.println(cl);
          System.out.println(a1.contains("af"));
         // System.out.println(a1.contains("c"));
         System.out.println(a1.indexOf("nie")>0);
ArrayList<String> list=new ArrayList<String>(Arrays.asList("nab","hri","gij","nab","finfi","nab"));
//System.out.println(list);
//int i=list.lastIndexOf("nab");
//System.out.println(i);

//list.remove(2);
//System.out.println(list);
//list.remove("hri");
//System.out.println(list);

ArrayList<Integer> in=new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,8,4,8));
in.removeIf(num->num%2==1);
System.out.println(in);
ArrayList<String> lt=new ArrayList<String>(Arrays.asList("peter","mahir","neel","peter","tenet","priya"));
lt.retainAll(Collections.singleton("peter"));
System.out.println(lt);

ArrayList<Integer> intn=new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,8,4,11,12,13,14));
ArrayList<Integer> subList=new ArrayList<Integer>(intn.subList(2, 8));
System.out.println(subList);

ArrayList<String> nlistt=new ArrayList<String>(Arrays.asList("peter","mahir","neel","tenet","priya"));
Object arr[]=nlistt.toArray();
System.out.println(Arrays.toString(arr));
for(Object o : arr) {
	System.out.println(o);
}

List<String> sourceList = new ArrayList<String>();
sourceList.add("A");
sourceList.add("B");
sourceList.add("C");
sourceList.add("D");
List<String> destList = new ArrayList<String>();
destList.add("V");
destList.add("W");
destList.add("X");
destList.add("Y");
destList.add("Z");
System.out.println("destList before copy: " + destList);
Collections.copy(destList, sourceList);
System.out.println("After" + destList);



	}

}
