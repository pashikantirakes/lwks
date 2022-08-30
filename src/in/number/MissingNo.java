package in.number.com;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int []{1,2,3,4,6,7};
		int tot=7;
		int exp=tot * ((tot)+1)/2;
		System.out.println(exp);
		int sum=0;
		for(int num : arr) {
			sum=sum+num;
		}
		System.out.println(exp-sum);
		
		
		
		
		
		
		//No dup.vaues,no need to be sorted,values in some range eg,1-10,1-5
		int[] a= {1,2,4,5,6,3,8};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		//System.out.println("sum"+sum1);
		int sum2=0;
		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("Missing no " + (sum2-sum1));
	}

}
