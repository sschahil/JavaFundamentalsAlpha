
public class MemberAccessTest {
	
	public static void main(String[] args) {
		
		Time1 time = new Time1();
		
		//these are private variables of Time1.java we cannot access these variables
		time.hour = 7; 
		time.minute = 15;
		time.second = 30;
		
	}
	
}
