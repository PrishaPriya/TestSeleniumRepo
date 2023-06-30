
import java.util.Scanner;
public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Enter any number");
		
		Scanner r = new Scanner(System.in);
		a = r.nextInt();
		
		if(a>0) {
			
			System.out.println("Positive Number");
		}
		else {
			
			System.out.println("Negative number");
		}
		
		
	}
}
