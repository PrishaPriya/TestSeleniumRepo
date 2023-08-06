package AccessModifiers;

public class AllAM1 {
	
	public void  m1() {
		System.out.println("Public method");
		
	}
	
	void m2() {
		System.out.println("Default method");
	}

	private void m3() {
		
		
	}
}

class Object{
	
	public static void main(String[] args) {
		
		AllAM1 a1 = new AllAM1();
		a1.m1();  // public access modifier visible every where.
		a1.m2();  // default visible in package.
		// a1.m3(); // private visible only class.  
		
	}
}