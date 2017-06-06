
public class Time2Test {
	
	public static void main(String[] args) {
		
		Time2 time = new Time2(15,30,25);
		
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());
		System.out.println();
		time.setHour(14);
		time.setMinute(50);
		time.setSecond(15);
		
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());
	}
	
}
