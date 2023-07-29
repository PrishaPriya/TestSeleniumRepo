
public class HourMinut {
	
	public static void main(String[] args) {
		
		int s = 86399;
		
		int hour = s/3600;
		
		int seconds = s%60;
		
		s=s%3600;
		int min = s/60;
		
		System.out.format("%d:%d:%d",hour,min,seconds);
		
	}

}
