package gettingvalues;
import java.util.*;

public class A3 {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		int []a=new int[s.nextInt()];
		
		System.out.println(a);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Enter the element in a["+i+"]");
			a[i]=s.nextInt();
//			System.out.println(a[i]);
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
