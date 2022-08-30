package in.array.com;

public class NxtGreaterEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1= {12,99,3,34,8,65,76};
		printGrat(a1);
	}

	private static void printGrat(int[] a1) {
		// TODO Auto-generated method stub
		
		int next,i,j;
		for(i=0;i<a1.length;i++) {
			next=-1;
			for(j=i+1;j<a1.length;j++) {
				if(a1[i]<a1[j]) {
					next=a1[j];
					break;
				}
			}
			System.out.println(a1[i]+"-"+next);
		}
	}

}
