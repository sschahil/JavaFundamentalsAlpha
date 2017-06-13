//Write code to check a String is palindrome or not?

import java.util.*;

public class StringQuestion1 {
	
	static Scanner input = new Scanner(System.in);

	private static String name;

	public static void main(String[] args) {
		
		System.out.println("Enter a word to check for it being a palindrome");
		name = input.nextLine();
		
		palindrome(name);
	}

	public static void palindrome(String name1) {

		int index = 0;
		char[] charArray1 = new char[name1.length()];

		for(int i = (name1.length() - 1); i >= 0; i--)
		{
			charArray1[index] = name1.charAt(i);
			index++; 
		}
		
		String name2 = new String(charArray1);
		
		System.out.println(name1);
		System.out.println(name2);
		
		if(name1.equals(name2))
			System.out.println("The string " + name + " is a palindrome.");
		else
			System.out.println("The string " + name + " isn't a palindrome.");
	}

}
