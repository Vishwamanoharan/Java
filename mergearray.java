package numberprogramming;
//WAJP MERGING TWO ARRAYS

import java.util.Arrays;

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40};
		int[] b= {50,60,70};
		
		
		int res[]=new int[a.length+b.length];
		
		for(int index=0,m=0,n=b.length-1 ; index<res.length ; index++) {
			if(m<a.length) {
				//for a array using this
				res[index]=a[m++];
			}
			else if(n>=0) {
				//for b array we use this
				res[index]=b[n--];
				
			}
		}
		System.out.println(Arrays.toString(res));

	}

}
