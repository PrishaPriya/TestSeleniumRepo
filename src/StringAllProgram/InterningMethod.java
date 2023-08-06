package StringAllProgram;

public class InterningMethod {
	
	public static void main(String[] args) {
		
		String s1  = "Test";
		String s2  = "Test";
		
		String s3 = new String("Test");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		// interning method is used to return string from memory if it is created by new keyword
		// it creates an exact copy of the heap string object in the string constant pool.
		
		String s4 = s3.intern();
		
		System.out.println(s1==s4);
	}

}
