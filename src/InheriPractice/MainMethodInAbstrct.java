package InheriPractice;

abstract class MainMethodInAbstrct {
	
	public static void main(String[] args) {
		Prisha p = new Prisha();
		p.Prisha1();
	}

	//Yes we can use the main() method in  abstract class.
}

class Priya{
	
	public void Priya1() {
		System.out.println("Priya");
	}
}

class Prisha extends Priya{
	
	public void Prisha1() {
		System.out.println("Prisha");
	}
}