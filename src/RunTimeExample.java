
public class RunTimeExample {
	
	public static void main(String[] args) {
		
		Bike b1 = new Scooty();
		b1.Wheels();
	}

}

class Bike{

	public void Wheels() {

		System.out.println("Bike have a two wheels");
	}
}

class Scooty extends Bike{

	public void Wheels() {

		System.out.println("Scooty have a two wheels");
	}
	
}	