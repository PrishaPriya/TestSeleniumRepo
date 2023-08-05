package StringAllProgram;

public class Diffrence {
	
	//  difference between == and equals(…) in comparing Java String objects?
	
	// == is used for check both the object piont to the same memory location or not.
	
	// .equals() is used to check object value.
	
	public static void main(String[] args) {
		
		String s1 = new String ("Priya");
		String s2 = new String ("Priya");
		
		System.out.println(s1==s2); // false
		
		String s3 = "Prisha";
		String s4 = "Prisha";
		
		System.out.println(s3==s4); //True
		
		System.out.println(s1.equals(s2));
		
		
	}
}
