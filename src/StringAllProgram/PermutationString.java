package StringAllProgram;

public class PermutationString {  
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		printPermutations(a, 0);
	}
	

 public static void printArray(int[] a) {
	 
	 System.out.println("\n");
	 
	 for(int i =0; i<a.length; i++) {
		 
		 System.out.print(a[i] +  " ");
	 }
 }
 
 public static void swap(int[] a, int i, int j) {
	 
	 int temp = a[i];
	 a[i] = a[j];
	 a[j] = temp;
	 
 }
 
 public static void printPermutations(int [] a, int cid) {
	 
	 if(cid == a.length-1) {
		 
		 printArray(a);
		 return;
	 }
	 
	 for(int i=cid; i<a.length; i++)
	 {
		 
		 swap(a, i, cid);
		 printPermutations(a, cid+1);
		 swap(a, i, cid);
	 }
	 
 }
}