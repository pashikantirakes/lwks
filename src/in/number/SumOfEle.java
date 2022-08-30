package in.number.com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Streams
		int[] arr= {23,45,43,677};
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		//
		int sum1=IntStream.of(arr).sum();
		System.out.println(sum1);
		
		//reduce()
     int sum2=Arrays.stream(arr).reduce((c,d)->c+d).getAsInt();
     System.out.println(sum2);
     
     int sum3=Arrays.stream(arr).reduce(Integer::sum).getAsInt();
     System.out.println(sum3);
     //SumaryStati
    long sum4= Arrays.stream(arr).summaryStatistics().getSum();
    System.out.println(sum4);
	}

}
