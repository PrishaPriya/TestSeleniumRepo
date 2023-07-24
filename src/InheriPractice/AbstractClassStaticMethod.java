package InheriPractice;

public class AbstractClassStaticMethod {
   
	public static void main(String[] args) {
		StaticMethod.M1();
	}
}

abstract class StaticMethod{
	
	public static void M1() {
		
		System.out.println("Abstract class have static method");
		
	}
}