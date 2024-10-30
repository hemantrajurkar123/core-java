package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "welcome";
		String rev="";
		for(int i=s.length()-1;i>-1;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}

// To reverse a string, we need to extract each character from the string from the last index to the first one
// To do this we have to iterate the string. for this you need to use for loop
// Even to iterate a string we need an index. And that index needs to be an integer in the for loop
// We can then initiate the index with the string length-1, and iterate reverse till the starting index of the string
// In each iteration, we can add the character extracted to the another string variable called reverse