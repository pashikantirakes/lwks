package in.string.com;

public class RemoveDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RemoveDupChar 
		
		String s="finionw";
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(i->sb.append((char)i));
		System.out.println(sb);

		
		//Replace char
		String g="Ma niofw fnei fndlkn";
		char ch[]=g.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='f') {
				ch[i]='q';
			}
		}
		System.out.println(ch);
	}

}
