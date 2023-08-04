
public class ParameterizedMethed {
	
	public static void main(String[] args) {
		
		ParameterizedMethed p1 = new ParameterizedMethed();
		
		p1.sum(100, 200);
		
		ParameterizedMethed.multiple(8, 9);
		
	}
	
	int sum(int i, int j) {
		
		int k = i+j;
		
		System.out.println(k);
		return k;
		
		
	}
	
	static int multiple(int a, int b) {
		
		int c = a*b;
		System.out.println(c);
		return c;
	}

}
