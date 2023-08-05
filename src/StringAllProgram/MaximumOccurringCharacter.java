package StringAllProgram;

public class MaximumOccurringCharacter {
	
	public static void main(String[] args) {
		
		String st1 = "abcabcabcaabc";
		
		int len = st1.length();
		
		int max=-1;
		char result=0;
		
		int count[] =new int[256];
		
		for(int i =0; i<len; i++) {
			
			count[st1.charAt(i)]++;
			
			}
		for(int i=0; i<len; i++) {
			if(max<count[st1.charAt(i)]) {
				
				max = count[st1.charAt(i)];
				result= st1.charAt(i);
				
				
			}
		}
		
		System.out.println(result);
	}

}
