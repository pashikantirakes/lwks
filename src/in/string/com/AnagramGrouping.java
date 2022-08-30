package in.string.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"eat","tea","bat","tan","tab","ate"};
		List<List<String>> l=groupingAnagram(str);
		l.forEach(t->System.out.println(t+" "));
	}

	private static List<List<String>> groupingAnagram(String[] str) {
		List<List<String>> result=new ArrayList<>();
		HashMap<String,List<String>> map=new HashMap<>();
		for(String arr: str) {
			char[] ch=arr.toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			if(map.containsKey(key)) {
				map.get(key).add(arr);
				}
			else {
				List<String> strList=new ArrayList<>();
				strList.add(arr);
				map.put(key, strList);
			}
		}
 		result.addAll(map.values());
		return result;
	}

}
