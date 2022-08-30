package in.number.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FreqOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23454;
		Map<Integer,Integer> m=new HashMap<>();
		while(num != 0) {
			int n=num%10;
			if(m.containsKey(n)) {
				m.put(n, m.get(n)+1);
			}else {
				m.put(n,1);
			}
			num=num/10;
		}
		Set<Integer> s=m.keySet();
		
		for(Integer k: s) {
			System.out.println(" " + k + " : " + m.get(k));
		}

	}

}
