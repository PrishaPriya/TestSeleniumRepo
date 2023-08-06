package Constructor;

public class A1 {
	
	A1(){
		
	//	this();
		A1();  //inside the Constructor we are calling same constructor.
			
	}
	
	A1(int i){
		
	}
	
	public void A1() {
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		A1 a = new A1();
		a.A1();
	}

}
