package AccessModifiers;

public class Test {
	
	protected int x, y;
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		System.out.println(t1.x + " " + t1.y);
	}

}

// output : 0 0 