package in.coll.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailfastAndFailsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fail -Fast
//Map<String,Integer> mp=new HashMap<>();
//mp.put("one",1);
//mp.put("two",2);
//mp.put("three", 3);
//mp.put("four", 4);
////System.out.println(mp);
//Iterator<Entry<String,Integer>>  itr=mp.entrySet().iterator();
//while(itr.hasNext()) {
//	//mp.put("five", 5);
//	Map.Entry<String,Integer> pr=itr.next();
//	mp.put("sfssf", 34);
//}
   ConcurrentHashMap<String, Integer> cmp=new ConcurrentHashMap<String, Integer>();
   cmp.put("one",1);
   cmp.put("two",2);
   cmp.put("three", 3);
   cmp.put("four", 4);
   Iterator<Entry<String,Integer>> it=cmp.entrySet().iterator();
   while(it.hasNext()) {
	   Map.Entry<String, Integer> chm=it.next();
	   cmp.put("gwed", 67);
	   System.out.println(chm.getKey() + " - " + chm.getValue());
   }
   
   CopyOnWriteArrayList<String> cp=new CopyOnWriteArrayList<>();
   cp.add("eei");
   cp.add("ook");
   cp.add("tft");
   Iterator<String> ir=cp.iterator();
   while(ir.hasNext()) {
	   if(ir.next()=="ook") {
		   cp.remove(1);
	   }
   }
   System.out.println(ir);
   
   
   
   
   
   
   
   ArrayList<Integer> a=new ArrayList<>();
	a.add(23);
	a.add(43);
	a.add(54);
	a.add(79);
	a.add(908);
	//while loop
	Iterator itr=a.iterator();
	while(itr.hasNext()) {
	    System.out.println(itr.next());
	}
	System.out.println("Using Adv for loop----");
	for(int i : a) {
		System.out.println(i);
	}
	System.out.println("Using Adv for loop----");
for(int i=0;i<a.size();i++) {
System.out.println(a.get(i));
}
	}

}
