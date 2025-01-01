package practice_program;

public class ReverseString1 {

	public static void main(String[] args) {
		String s = "programming";
		char ch;
		String ns = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			ns=ns+ch;
			
		}
		System.out.println(ns);
	}

}
