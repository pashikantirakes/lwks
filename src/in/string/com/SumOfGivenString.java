package in.string.com;

public class SumOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]= {"2AA","12","ABC","C1a1" };
		int sum=0;
		for(int i=0;i<str.length;i++) {
			String s=str[i];
			System.out.print(s);
			for(int j=0;j<s.length();j++) {
				if(Character.isDigit(s.charAt(j))) {
					sum=sum+Integer.parseInt(s.charAt(j)+"");
				}
			}
			
		}
		System.out.println("Sum= " +sum);
		
		String s="123jfeo686";
		int cnt=0;
		boolean isdigit=false;
		int sum1=0;
		int len=s.length();
		for(int i=0;i<len;i++) {
			if(Character.isDigit(s.charAt(i))) {
				cnt++;
				isdigit=true;
			}else {
				if(isdigit) {
					sum1=sum1+Integer.parseInt(s.substring(i-cnt, i));
					isdigit=false;
					cnt=0;
				}
			}
		}
		if(cnt>0 && isdigit) {
			sum1=sum1+Integer.parseInt(s.substring(len-cnt, len));
		}
		System.out.println(sum1);
		
		
		//System.out.println(new int[] {55,52,33,48,68,26}.length);
		//System.out.println(new int[] {91,44,17,41,11}[3]);
			}

}
