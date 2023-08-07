package AccessModifiers;

public class NonStaticMethod {
	
public static void main(String[] args) {
		
	N1 a = new N1();
	a.n1();
	
	N2 b = new N2();
	b.n2();
	
	/*N3 c = N3();
	c.n3();
	
	N4 d = new N4();
	d.n4();
		
 //private static method is not visible anther class.   
		
	}*/

}

class N1{
	
	public void n1() {
		
		System.out.println("Public static method");
	}
}

class N2{
	
	protected  void n2() {
		
		System.out.println("Protected static method");
	}
}

class N3{
	
	 void n3() {
		
		System.out.println("Default method");
	}
}

class N4{
	
	private void n4() {
		
		System.out.println("private static method");
	}
}

}
