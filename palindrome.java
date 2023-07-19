package numberprogramming;
import java.util.*;
public class palindrome {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		String s=sc.nextLine(),rev="";
		
		
		for (int index = s.length()-1; index >=0; index--) {
			
			rev+=s.charAt(index);
			
		}
		
		System.out.println(rev);
		
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
