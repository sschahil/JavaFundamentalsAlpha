
public class Time1Test {
	
	public static void main(String[] args) {
		
		Time1 timeFormatting = new Time1();
		
		System.out.print("The initial universal time is: ");
		System.out.println(timeFormatting.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(timeFormatting.toString());
		System.out.println();
		
		timeFormatting.setTime(13, 27, 6);
		System.out.print("Unverisal time after setTime is: ");
		System.out.println(timeFormatting.toUniversalString());
		System.out.print("Standard time after setTime is: ");
		System.out.println(timeFormatting.toString());
		System.out.println();
		
		timeFormatting.setTime(99, 99, 99);
		System.out.println("After attempting invalid settings: ");
		System.out.print("Universal time: ");
		System.out.println(timeFormatting.toUniversalString());
		System.out.print("Standard Time: ");
		System.out.println(timeFormatting.toString());
	}//end main method
	
}//end Time1Test class
