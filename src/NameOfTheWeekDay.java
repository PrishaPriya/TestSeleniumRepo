
import java.util.Scanner;
public class NameOfTheWeekDay {
	
	public static void main(String[] args) {
		
		int d;
		
		System.out.println("Enter a number");
		
		Scanner r = new Scanner(System.in);
		d=r.nextInt();
		
		if(d==1) {
			
			System.out.println("Sunday");
		}
		else if(d==2) {
			
			System.out.println("Monday");
		}
		else if(d==3) {
			
			System.out.println("Tuesday");
		}
		else if(d==4) {
			
			System.out.println("Wednesday");
		}
		else if(d==5) {
			
			System.out.println("Thursday");
		}
		else if(d==6) {
			
			System.out.println("Friday");
		}
		else if(d==7) {
			
			System.out.println("Saturday");
		}
		
	}

}
