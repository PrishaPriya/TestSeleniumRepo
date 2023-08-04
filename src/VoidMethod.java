
public class VoidMethod {
	
	public static void main(String[] args) {
		
		VoidMethod v1 = new VoidMethod();
		
		//v1.sum();
		v1.multiple();
		
		VoidMethod.sum();
		
		
	}
	
	static void sum() {
		
		System.out.println("void with static method");
		
	}
	
	void multiple() {
		
		System.out.println("void method");
	}

}
