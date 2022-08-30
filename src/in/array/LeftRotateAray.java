package in.array.com;

public class LeftRotateAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1= {12,23,22,45,34};
		//Store the 1st ele in temp. var
		int temp=a1[0];
		
		for(int i=1;i<a1.length;i++) {
			
			//shift 1 ele to the left
			
			a1[i-1]=a1[i];
		}
		//Store the temp (1st value) kept in last position
	       a1[a1.length-1]=temp;
	       
      for(int i : a1) {
    	  System.out.println(i);
      }
      
	}
	

}
