package access1;

public class MainClass {
	
	public static void main(String[] args) {
		
		c t1 = new c();
		t1.test();
	}
	
}

 class a{
	 
	 void test() {
		 
	 }
 }
 
 class b extends a {
	 
	 protected void test() {
		 

 }	 
 }
 
 class c extends b{
 
  public void test() {
	  
  }
 } 