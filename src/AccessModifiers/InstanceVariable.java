package AccessModifiers;

  

public class InstanceVariable {
	
	int a ;  // default instance variable visible in package 
	
	public int b;  // public instance variable visible in every where
	
	private int c;  // private instace variable visible within the class
	
	//protected d = 9;   // protected instance variable
	
	
	public static void main(String[] args) {
		
		InstanceVariable obj2 = new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();
		
		obj2.b=20;
		obj3.c=30;
		
		System.out.println(obj2.b+ " "+ obj3.c);
		
		
		
		
	}

}

class J{
	
	public static void main(String[] args) {
		
		InstanceVariable obj1 = new InstanceVariable();
		obj1.a=10;
		
		System.out.println(obj1.a);
		
		
	}
}
