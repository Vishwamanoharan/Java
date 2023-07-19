package numberprogramming;
import java.util.Arrays;
import java.util.Scanner;

//WAJP TO ROTATE THE GIVEN ARRAY N NO. OF TIMES?

public class Rotate_array_n_times {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter the value of N");
		
		int n=s.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			int first=a[0];
			
			for (int index = 0; index < a.length-1; index++) {
				
				a[index]=a[index+1];
				
			}
			
			a[a.length-1]=first;
			
		}
		
		System.out.println("for n:"+n);
		
		System.out.println(Arrays.toString(a));
		
		
		

	}

}
