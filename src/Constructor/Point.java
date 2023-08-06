package Constructor;

 public class Point {
	
	int x, y;
	
	public Point(int _x, int _y) {
		
		x = _x;
		y = _y;
		
	}

}

 class Main{
	
	public static void main(String[] args) {
		
		Point p1 = new Point(5,4);
		
		System.out.println("x = " + p1.x + ", y = " + p1.y);
	}
	
	
}