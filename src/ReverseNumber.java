
public class ReverseNumber {
	
	public static void main(String[] args) {
  		int a = 346;
		int r =0;
		
		while(a !=0) {
			
		 int reminder = a%10;
		 
		 r=r*10+reminder;
		 a=a/10;
		
		}
		System.out.println("Reverse order" +r);
 			
			
			
		
	}

}
