
public class MethodChaining {
	
	MethodChaining method1() {
		
		return this;
		
	}

	MethodChaining method2() {
		
		return this;
		
	}
}

class demo{
	
	public static void main(String[] args) {
		
		MethodChaining a1 = new MethodChaining();
		a1.method1().method2();
	}
}