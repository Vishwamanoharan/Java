package numberprogramming;

import java.util.Arrays;


//WAJP TO WRITE ZIGZAG ARRAY

public class Zigzagarray {
	public static void main(String[] args) {
		int []a= {1,3,5,7};
		int []b= {2,4,6,8};
		
		int []res=new int[a.length+b.length];
		
		for(int index=0,m=0,n=0;index<res.length;index++) {
			if(index%2==0) {
				res[index]=a[m++];
			}
			else {
				res[index]=b[n++];
			}
		}
		
		System.out.println(Arrays.toString(res));
	
	}

}
