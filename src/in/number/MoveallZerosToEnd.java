package in.number.com;

import java.util.Arrays;

public class MoveallZerosToEnd {

	public static void main(String[] args) {
		// Move all Zeros To End
		int arr[]= {1,0,2,0,4,6,0,4,0,0,45,65};
		int op[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				op[k]=arr[i];
				k++;
			}
		}
		
     System.out.println(Arrays.toString(op));
     
     //movZero(new int[] {12, 0, 7, 0, 8, 0, 3});
	  
     //movZero(new int[] {1, -5, 0, 0, 8, 0, 1});

     //movZero(new int[] {0, 1, 0, 1, -5, 0, 4});
	}

	private static void movZero(int[] input) {
		// TODO Auto-generated method stub
		
		//Initializing position
				int counter=0;
				//Traversing
			for(int i=0;i<input.length;i++){
				if(input[i]!=0){
					input[counter]=input[i];
					counter++;
				}
			}
			 while (counter < input.length)
		     {
		         input[counter] = 0;

		         counter++;
		     }

		     System.out.println(Arrays.toString(input));
		 }
		
	}

