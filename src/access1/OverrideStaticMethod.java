package access1;

public class OverrideStaticMethod {

	A1 b1 = new A1();
	b1.test98();
}
 
class A1{
	
	static void test98() {
		
	}
}

class B1 extends A1{
	
	 static void test98() {
		
	}
}