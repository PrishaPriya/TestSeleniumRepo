package AccessModifiers;

public class StaticMethod {
	
	public static void main(String[] args) {
		
		
		S1.m1();
		
		S2.m2();
		
		S3.m3();
		
		
	//	S4.m4();             private static method is not visible anther class.   
		
	}

}

class S1{
	
	public static void m1() {
		
		System.out.println("Public static method");
	}
}

class S2{
	
	protected static void m2() {
		
		System.out.println("Protected static method");
	}
}

class S3{
	
	static void m3() {
		
		System.out.println("Default method");
	}
}

class S4{
	
	private static void m4() {
		
		System.out.println("private static method");
	}
}