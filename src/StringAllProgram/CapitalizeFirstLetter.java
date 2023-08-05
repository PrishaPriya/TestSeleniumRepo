package StringAllProgram;

import java.util.Scanner;

public class CapitalizeFirstLetter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any sentence");
		
		String originalStatement = scan.nextLine();
		
		String[] words = originalStatement.split(" ");
		
		String finalStatement = "";
		
		for(String word : words) {
			
			char[] ca =word.toCharArray();
			
			char c = ca[0];
			
			String firstChar = String.valueOf(c).toUpperCase();
			
			String capitializedWord = firstChar;
			
			for(int i=1; i<ca.length; i++) {

				capitializedWord =	capitializedWord + ca[i];
				
			}
				
			finalStatement = finalStatement + capitializedWord + " ";
			
					
			}
		
		System.out.println(finalStatement);
		
				
	}

}
