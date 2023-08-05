package StringAllProgram;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "test";
		String revStr = reverse(str);
		
		System.out.println(revStr);
		
	}

	private static String reverse(String str) {
		
		if(str == null || str.length() <= 1) {
			
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
		
	}
	
}
