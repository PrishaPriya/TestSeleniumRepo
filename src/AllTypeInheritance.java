
public class AllTypeInheritance {
	
	public static void main(String[] args) {
		monkey c1 = new monkey();
		c1.cat1();
		c1.dog();
		c1.monkey1();
	}
 
}

 class Animal{
	 
	 public void dog(){
		 
		 System.out.println("Dog name is Cicy");
	 }
	 
 }
  class cat extends Animal{
	  
	  public void cat1() {
		  System.out.println("Cat name is Caty");
	  }
  }
  
  class rat extends cat{
  
     public void rat1() {
    	 
    	 System.out.println("Rat name is Nancy");
    	 
     }	 
  }
    class monkey extends cat{
    	
    	public void monkey1() {
    		
    		System.out.println("Monkey");
    		
    	}
    } 