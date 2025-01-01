package practice_program;

public class ReverseString {

	public static void main(String[] args) {
		String s="programming";
		String ns="";
		char c;
		
//		for(int i=s.length()-1;i>=0;i--) {
		for(int i=0;i<s.length();i++) {
			c= s.charAt(i);
			ns=c+ns;
		}
		System.out.println(ns);
	}

}

// In string reverse there are 2 approaches
// Start the string index from start and then add the next letter before the previous letter
// Second approach is start the string from the end and add letters accordingly
