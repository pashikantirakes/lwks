package in.number.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
ArrayList num=new ArrayList();
for(int i=1;i<50;i++) {
	num.add(i+1);
}
System.out.println(num);
Collections.shuffle(num);
System.out.println("Random number " + num.get(0));

Random r=new Random();
r.ints(1,65).limit(5).forEach(System.out::println);
	}

}
