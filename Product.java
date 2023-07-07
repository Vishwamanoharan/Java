package tostringmethod;

public class Product {
	
	String Pname;
	double Rate;
	int Pid;
	int Pquantity;
	
	Product(){
		//LI
	}
	
	Product(String Pname,double Rate,int Pid,int Pquantity){
		super();
		this.Pname=Pname;
		this.Rate=Rate;
		this.Pid=Pid;
		this.Pquantity=Pquantity;
	}
	public String toString() {
		return Pname+":"+Rate+":"+Pid+":"+Pquantity;
		
	}
	
	public static void main(String[] args) {
		Object P1=new Product("Yeppi",12.0,1,40);
		Object P2=new Product("maggi",14.0,14,60);
		
		System.out.println(P1);
		System.out.println(P2);
	}
	
	}


