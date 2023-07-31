import java.util.Scanner;


public class Temperature {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double Fahrenheit, Celsius, Kelvin;
		
		System.out.print("Enter temperature in Celsius : ");
		
		Celsius = sc.nextDouble();
		
		Fahrenheit = Celsius*1.8+ 32;
    
		Kelvin = Celsius + 273;

		System.out.println("\n Temperature in Kelvin :" +Kelvin);
		
		System.out.println("\n Temperature in Fahrenheit :" +Fahrenheit);



	}

}
