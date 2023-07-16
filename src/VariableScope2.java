
public class VariableScope2 {
	
	
		public static void main(String args[]) {
		System.out.println(fun());
		}
		int fun() {
		return 20;
		}
		

}

//Oupot is compiler error because can not make a static reference to a non static method.