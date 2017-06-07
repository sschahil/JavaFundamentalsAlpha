package code.java.newpackages;

public class Time1 {
	
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		
		//short hand representation of if/else statement 
		hour = ( (h >= 0 && h < 24) ? h : 0); //validates hour
		minute = ( (m >= 0 && m < 60) ? m : 0); //validates minute
		second = ( (s >= 0 && s < 60) ? s : 0); //validates second	
	}//end setTime method
	
	//converts to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}//end toUniversalString method
	
	public String toString() {
		
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12 : hour % 12),
				minute, second, (hour < 12 ? "AM" : "PM"));
	}// end toString method
	
}//end Class Time1
