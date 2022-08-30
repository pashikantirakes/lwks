package in.number.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupNumberUsingHs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(12,34,54,35,12,54);
		Set<Integer> s=new HashSet<>(l);
		for(Integer i : s) {
			if(!s.add(i)) {
				//System.out.println(i);
			}
		}
		
		//Using Java-8
		//l.stream().distinct().forEach(System.out::println);
		l.stream().filter(e->!s.add(e)).forEach(System.out::println);
Map<Integer,Long> ml=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
ml.forEach( (k,v)->System.out.println(k+"- " + v));

//Using Coll.f/w
Map<Integer,Integer> mp=new HashMap<>();
for(int num : l) {
	if(mp.containsKey(num)) {
		mp.put(num, mp.get(num)+1);
	}else {
		mp.put(num, 1);
	}
}
//Set<Entry<Integer,Integer>> st=mp.entrySet();
//for(Entry<Integer,Integer> fr : st) {
//	
//		System.out.println(fr.getKey()+"-"+fr.getValue());
//	
//}
for(Map.Entry ent : mp.entrySet()) {
	System.out.println(ent.getKey()+"-"+ent .getValue());
}
	}

}
