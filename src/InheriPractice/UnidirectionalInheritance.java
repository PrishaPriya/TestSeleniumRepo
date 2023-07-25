package InheriPractice;

public class UnidirectionalInheritance {
	
	public static void main(String[] args) {
		
		TcsBranch1 t1 = new TcsBranch1();
		t1.MumbaiBranch();
	}

}

class TcsMainBranch{
	
	public void PuneBranvh() {
		
		System.out.println("Hi");
		
		
	}
}

class TcsBranch1 extends TcsMainBranch{
	
	public void MumbaiBranch() {
		System.out.println("Hello");
	}
}

// Inheritance is unidirectional because we extends parent class property to child class property.
// We can not extends child class property to parent class property.


