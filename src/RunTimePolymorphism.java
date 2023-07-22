
public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		Car c1 = new Maruthi();
		
		
		// Compiler error is giving
		//c1.Method2();  // Here Method2 can not visible for parent class Car 
		c1.Method1();
		
	}

}

class Car{
	
	public void Method1() {
		
		System.out.println("Car = Method1");
	}
}

class Maruthi extends Car{
	
	public void Method1() {
		
		System.out.println("Maruthi = Method1");
		
	}
		
		public void Method2() {
			
			System.out.println("Maruthi = Method2");
			
		}
	
}
