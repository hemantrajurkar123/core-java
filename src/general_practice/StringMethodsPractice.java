package general_practice;

import java.util.Arrays;

public class StringMethodsPractice {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2="to java";
		String s3=" Hello ";
		System.out.println("String length :" + s1.length());
		System.out.println(s1+" "+s2);
		System.out.println("Before trimming length :"+s3.length());
		String s4=s3.trim();
		System.out.println("After trimming length : "+s4.length());
		System.out.println(s2.contains("java")); //true
		System.out.println(s2.replace("java","selenium"));
		String s5="Welcome";
		String s6="welcome";
		boolean result=s5.equals(s6);
		System.out.println(result); //false
		System.out.println(s5.equalsIgnoreCase(s6)); //true
		String s7="abc@xyz";
		String[] a1=s7.split("@"); // return type of split method is an array of strings
		System.out.println(Arrays.toString(a1)); 
		System.err.println(a1[0]); // As the result of split is an array, we can access the strings inside this array with an index
	}

}
