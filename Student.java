package tostringmethod;



public class Student {
	
	String name="Vishwa";
	int id=12;
	
	public String toString() {
		return name+":"+id;
	}
	
	public static void main(String[] args) {
		Student ref=new Student();
		
		System.out.println(ref);
	}
	

}
