package in.pattern.com;

public class Numbers {

	public static void main(String[] args) {
		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print(p);
			}
			System.out.println();
		}
		System.out.println("________________");
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print(p);
			}
			System.out.println();
		}
		System.out.println("________________");

		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {	
				if(i%2==0) {
				System.out.print("2");

			}else {
				System.out.print("1");
			}
		}
			System.out.println();

	}
		System.out.println("________________");
//Change in column orders
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int p=1;
				System.out.print(p+++ " ");
			}
			System.out.println();
		}
	}
	
	

}
