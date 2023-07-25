package InheriPractice;

public class AllVariables {
	
	int b = 20;  // instance variable
	
	static int c = 50; // static variable
	
	public static void main(String[] args) {
		
		int a = 10; // Local variable
		
		AllVariables ref = new AllVariables();
		
		System.out.println(a);
		
		System.out.println(AllVariables.c);
		
		System.out.println(ref.b);
	}

}
