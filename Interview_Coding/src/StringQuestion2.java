//Write a method which will remove any given character from a String?

import java.util.*;

public class StringQuestion2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name;
		
		System.out.println("Enter a string");
		name = input.nextLine();
		
		removeChar(name);
	}
	
	public static void removeChar(String name1) {
		
		int index = 0;
		char remove;
		char[] nameArr;
		
		System.out.println("Enter the character you would you like to remove?");
		remove = input.next().charAt(0);
		
		nameArr = name1.toCharArray();
		
		for(int i = 0; i < nameArr.length; i++) 
		{
			if(nameArr[i] == remove)
			{
				index = i;
			}
		}
		
		if(index == 0 )
			System.out.println(name1.substring(index + 1));
		else
			System.out.println(name1.substring(0, index) + name1.substring(index + 1));
	}
	
}
