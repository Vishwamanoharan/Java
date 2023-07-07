package hashcodemethod;

public class Book {
	
	String bid="14";
	double Price=98.0;
	
	
}

class Student{
	String Sid="11";
	double marks=130.0;
	
	
}

class Driver{
	
	public static void main(String[] args) {
		Book R1=new Book();
		Student R2=new Student();
		
		System.out.println(R1 .equals(R2));//false
		System.out.println(R2 .equals(R2));//true
	}
}

