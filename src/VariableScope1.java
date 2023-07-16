
public class VariableScope1 {

	
		public static void main(String args[]) {
		System.out.println(fun());
		}
		static int fun() {
		static int x= 0;
		return ++x;
		}
		
		// compiler time error is showing because of static keyword.
}
