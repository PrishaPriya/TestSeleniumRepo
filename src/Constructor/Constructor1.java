package Constructor;

public class Constructor1 {
	
	int i;
	
	public static void main(String[] args) {
		
		Constructor1 c1 = new Constructor1(5);
		System.out.println(c1);
	}
	
	Constructor1(int i){
		
		this.i =i;
	}

}
