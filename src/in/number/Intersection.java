package in.number.com;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]= {1,2,3,4};
int a2[]= {4,5,2,6,1,7,8};
Set<Integer> s=new HashSet<>();
for(int i=0;i<a1.length;i++) {
	s.add(a1[i]);
}
for(int j=0;j<a2.length;j++) {
if(	s.contains(a2[j])){
	System.out.println(a2[j]);
}
}
	}

}
