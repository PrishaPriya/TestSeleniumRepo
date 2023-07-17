package access1;

public class ChangeVisibilty {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		a1.test();
		b1.test();
		c1.test();
		
	}

}

class A{
	

 void test() {
		
	}
}
 class B extends A{
	 
	 void test() {
		 
	 }
 }
 class C extends B{
	 
	 void test() {
		 
	 }
 }