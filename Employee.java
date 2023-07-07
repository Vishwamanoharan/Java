package tostringmethod;

public class Employee {
	
	String ename;
	String id;
	double sal;
	String DOB;
	
	Employee(){
		//LI
	}
	
	Employee(String ename,String id,double sal,String DOB){
		this.ename=ename;
		this.id=id;
		this.sal=sal;
		this.DOB=DOB;
		//LI
	}
	
	//@Override
	public String toString() {
		return ename+":"+id+":"+sal+":"+DOB;
	}
	
	public static void main(String[] args) {

		Object ref=new Employee("Sundher","11",1000000.0,"12-03-2000");
		Object ref1=new Employee("watson","12",1000000.0,"21-04-2020");
		
		System.out.println(ref);
		System.out.println(ref1);
		
		
	}
	

}
