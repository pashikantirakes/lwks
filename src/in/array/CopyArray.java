package in.array.com;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] old= {1,2,3,4};
		int[] newAray=Arrays.copyOf(old, old.length);
		for(int i=0;i<newAray.length;i++) {
			System.out.println(newAray[i]);
		}
	}

}
