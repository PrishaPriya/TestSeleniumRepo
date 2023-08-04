
public class NonParamerized {
	
	public static void main(String[] args) {
		
		NonParamerized n1 = new NonParamerized();
		n1.valueOfPI();
		
		NonParamerized.sum();
		
	}
	
	double valueOfPI(){
			   
	double piValue = 3.14d;
			
	return piValue;		
		
	}
	
	static void sum() {
		
		System.out.println("hi");
		
	}

}


