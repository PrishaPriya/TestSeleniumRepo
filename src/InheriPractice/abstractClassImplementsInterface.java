package InheriPractice;

public interface abstractClassImplementsInterface {
	
	public void ABC();
	public void XYZ();

}

// Abstract class implements a interface methods but we can not create abstract class object.

abstract class Abc1 implements abstractClassImplementsInterface{
	
	public void ABC() {
		System.out.println("abc");
	}
	
	public void XYZ() {
		System.out.println("xyz");
	}
}

 class ObjectCreation{
	
	 public static void main(String[] args) {
		
		//  Abc1 a = new Abc1();
		 
	}
	
}