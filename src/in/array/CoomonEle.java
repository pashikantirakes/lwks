package in.array.com;

public class CoomonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1= {12,23,67,79,57,98,68};
		int[] a2= {72,8,832,67,68,23,754};
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.println(a1[i]);
					break;
				}
			}
		}
	}

}
