package in.string.com;

public class NoofWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to java world";
	int count=countNumberofWords(str);
	System.out.println(count);
	}

	private static int countNumberofWords(String str) {
    int count=0;
    if(str.charAt(0)!= ' ') {//find the char at particular index
    	count++;
    }
    for(int i=0;i<str.length();i++) {
    	if(str.charAt(i)== ' ' && str.charAt(i+1)!= ' ') {
    		count++;
    	}
    }
    return count;
	}
	

}
