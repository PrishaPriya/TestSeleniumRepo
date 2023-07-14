import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a=1,b=1,c,term;
		
		System.out.println("Enter term");
		
		Scanner r = new Scanner(System.in);
		term = r.nextInt();
		
		for(int i=1; i<=term;i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
