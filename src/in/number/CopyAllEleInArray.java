package in.number.com;

public class CopyAllEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]=new int[] {1,2,3};
		int a2[]=new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			a2[i]=a1[i];
		}
		System.out.println("Array-2 display");
		for(int i : a2) {
			System.out.println(i);
		}
	}

}
