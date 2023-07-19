package numberprogramming;

import java.util.Arrays;

public class Reversearray{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		for (int i = 0,m=a.length-1; i < b.length; i++,m--) {
			b[i]=a[m];
		}
		System.out.println("the reversed array is "+Arrays.toString(b));
	}
}