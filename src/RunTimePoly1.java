
public class RunTimePoly1 {

	public static void main(String[] args) {

		Car1 c1 = new Maruthi1();
		c1.Method1();

		Maruthi1 c2 = new Car1();
		c2.Method1();
	}
}

class Car1{

	public void Method1() {

		System.out.println("Car1 - Method1");
	}
}

class Maruthi1 extends Car1{

	public void Method1() {

		System.out.println("Maruthi - Method1");
	}
}