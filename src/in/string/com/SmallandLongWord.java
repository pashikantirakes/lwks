package in.string.com;

public class SmallandLongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Heelllo i am here Where are you";
		String word="";
		String small="",longest= "";
		String words[]=new String[100];
		int len=0;
		//Add extra space after string to get the last word in the given string  
		
		str=str+"";
		for(int i=0;i<str.length();i++) {
			//Split the string into words  
			if(str.charAt(i)!= ' ') {
				word=word+str.charAt(i);
			}else {
				  //Add word to array words  
				words[len]=word;
				//Increment length   
				len++;
				 //Make word an empty string    
				word="";
			}
		}
		   //Initialize small and large with first word in the string    
		small=longest=words[0];
		//Determine smallest and largest word in the string  
		for(int k=0;k<len;k++) {
			
			 //If length of small is greater than any word present in the string    
	          //Store value of word into small   
			if(small.length()>words[k].length()) {
				small=words[k];
			}
			  //If length of large is less than any word present in the string    
	          //Store value of word into large  
			if(longest.length()<words[k].length()) {
				longest=words[k];
			}
			
		}
		System.out.println("Small word " + small);
		System.out.println("Longest word - " + longest);
	}

}
