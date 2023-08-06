package StringAllProgram;

import java.util.Scanner;

public class PalindromeNum {
	
	public static void main(String[] args) {
		
		int n, s=0, c,r;
		
		System.out.println("Enter any Number");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		c=n;
		
		while(n>0) {
			
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		
		if(c==s) {
			
			System.out.println("Palindrome Number");
		}
		else {
			
			System.out.println("Not Palindrome Num");
		}
	}

}
