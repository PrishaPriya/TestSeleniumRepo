package AccessModifiers;

public class StaticVariable {
	
	public static void main(String[] args) {
		
		System.out.println(mainMethod.x);
		System.out.println(mainMethod.y);
	    //System.out.println(mainMethod.name);
	    System.out.println(mainMethod.city);
			
	}
	
	
}

class mainMethod{
	
	
	static int x = 10;
	public static int y = 20;
	private static String name = "Priya";
	protected static String city = "Pune";
	
	
	
	
	
}