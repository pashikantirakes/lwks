package in.javaeight.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NavnAutom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Sum of no.
		List<Integer> l=Arrays.asList(12,23,5,65,6,667,8,6);
	Optional<Integer> opt=	l.stream().reduce((a,b)->a+b);
       System.out.println(opt.get());
       
       //2.Avg
       
       double avg=l.stream().mapToInt(e->e).average().getAsDouble();
       System.out.println(avg);
       
       //3.sq,fil,avg
       
       double db=l.stream().map(e->e*e).filter(e->e>50).mapToInt(e->e).average().getAsDouble();
       System.out.println(db);
       
       //4. number starts with
   List<Integer> lt=l.stream(). map(i->String.valueOf(i)).filter(e->e.startsWith("6")).map(Integer::valueOf).collect(Collectors.toList());
              System.out.println(lt); 
              
              //5.Max & min
           int max=  l.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
           System.out.println(max);
         int min=  l.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
         System.out.println(min);
         
         //6.Sort no
         l.stream().sorted().forEach(System.out::println);
         List<Integer> sort=l.stream().sorted().collect(Collectors.toList());
         System.out.println(sort);
         List<Integer> revSort=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
         System.out.println(revSort);
         
         //7.Get 5 no and add
         Optional<Integer> opt1=l.stream().skip(5)/*.limit(5)*/.reduce((a,b)->a+b);
         System.out.println(opt1.get());
         
         //8.2nd highest no
        int no= l.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(no);
        int se=l.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(se);
	}

}


/*
 * BiFunction<Integer, Integer, Integer> bifn=(t,u)-> (t+u);
		//System.out.println(bifn.apply(3, 5));
				Function<Integer,Integer> fn=(number)->number*number;
				Integer in=bifn.andThen(fn).apply(10,20);
				System.out.println(in);
				
				BiConsumer<Integer, Integer> bicns=(a,b)->System.out.println(a+b);
				bicns.accept(12, 43);
				
				Map<Integer,String> m=new LinkedHashMap<>();
				m.put(1, "c");
				m.put(2, "c++");
				m.put(3, "java");
				m.put(4, "c#");
				m.forEach((k,v)->{
					System.out.println(k);
					System.out.println(v);
				});
				
				BiPredicate<String, String> bip=(a,b)->a.equals(b);
				System.out.println(bip.test("jkh", "jkh"));
				System.out.println(bip.test("nrok", "gii"));
				
				BiPredicate<Integer, Integer> bp=(x,y)->x>y;
				BiPredicate<Integer, Integer> bp2=(x,y)->x<y;
				
				boolean result=bp.and(bp2).test(12, 32);
				System.out.println(result);
				
				boolean res=bp.and(bp2).test(32, 43);
				System.out.println(res);
				*/
