package Constructor;

public class ThisKeyword {
	
	int x;
	String name;
	
	public ThisKeyword(int x){
		
		this.x = x;
		
	}
	
	public void M1(String name) {
		
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		ThisKeyword t1 = new ThisKeyword(5);
		
		ThisKeyword t2 = new ThisKeyword();
		
		t2.M1("Priya");

		System.out.println("Value of x = " + t1.x);
	}
	
	

}
