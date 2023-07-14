import java.util.Scanner;
public class ArmstrongmNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, rem,arm=0, c;
		
		System.out.println("Enter any number");
		n=sc.nextInt();
		c=n;
		while(n>0) {
			
			rem=n%10;
			arm = (rem*rem*rem)+arm;
			n = n/10;
		}
		if(c==arm)
			System.out.println("Armstrong number");
		else
			System.out.println("Not arnstrong number");
	}
	
}
