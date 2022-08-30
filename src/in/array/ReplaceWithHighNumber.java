package in.array.com;

public class ReplaceWithHighNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,9,5,11,6,1,7,6};
int size=arr.length;
int maxR=arr[size-1];
arr[size-1]=-1;
for(int i=size-2;i>=0;i--) {
	int temp=arr[i];
	if(maxR > arr[i]) {
		arr[i]=maxR;
	}else {  // if no higher no print -1
		arr[i]=-1;
	}
	if(maxR < temp) {  // update the max ele
		maxR=temp;
	}
}
for(int i=0;i<size;i++) {
	System.out.println(arr[i]);
}
	}

}
