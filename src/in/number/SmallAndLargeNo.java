package in.number.com;

public class SmallAndLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {23,-567,43,12,678,67,87,99,33};
		int lar =no[0];
		int smal=no[0];
		for(int i=1;i<no.length;i++) {
			if(no[i]>lar) {
				lar=no[i];
			}else{
				if((no[i]<smal)) {
				smal=no[i];
			}
			}
		}
		System.out.println("Large no = " + lar);
		System.out.println("small no = " + smal);

		//Second Largest Number
		
		int[] num={456,765,56,465,568};
		int temp;
		int len=num.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
		   if(num[i]>num[j]) {
			   temp=num[i];
			   num[i]=num[j];
			   num[j]=temp;
		   }
			}
	}
		System.out.println();
		for(int i=0;i<len;i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("2nd large - " + num[len-2]);
	}
}
