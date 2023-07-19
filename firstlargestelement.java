package numberprogramming;

//WAJP TO FIRST LARGEST And Smallest ELEMENT PRESENT INSIDE THE ARRAY.

public class firstlargestelement {

	public static void main(String[] args) {
		int[] a = { 8, 16, 24, 3, 4 };

		int largest = a[0];
		for (int index = 0; index < a.length; index++) {
			if (a[index] > largest) {

				// if(a[index]<smallest)-->this is for smallest value to find.......

				largest = a[index];

			}

		}

		System.out.println(largest);
	}

}
