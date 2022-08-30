package in.coll.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> m=new HashMap<>();
		m.put("three", 34);
		m.put("second",76);
		m.put("one",10);
		m.put("nine",99);
		//m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		List<Entry<String,Integer>>l=new ArrayList<>(m.entrySet());
		Collections.sort(l,(a1,a2)->a2.getValue()-a1.getValue());
		for(Entry<String,Integer> ent: l) {
			System.out.println(ent.getKey()+"-"+ent.getValue());
		}
		
		Collections.sort(l,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for(Entry<String,Integer> entry: l) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
