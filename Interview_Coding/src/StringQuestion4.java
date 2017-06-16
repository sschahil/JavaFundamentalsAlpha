//Write a function to find out longest palindrome in a given string?

import java.util.ArrayList;

public class StringQuestion4 {

	private static String randomWord = "heilikahannahlkjilijloollksjdlkjiaaaaj";
	
	public static void longestPalindrome(String word) {
		
		String substring;
		ArrayList<String> strLongest = new ArrayList<String>();
		
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = (i + 1); j < (word.length() - (i + 1)); j++ )
			{
				substring = word.substring(i,j);
				int index = 0;
				char[] charArray = new char[substring.length()];
				
				for(int k = (substring.length() - 1); k >= 0; k--)
				{
					charArray[index] = substring.charAt(k);
					index++; 
				}
				
				String name2 = new String(charArray);
				
				
				if(substring.equals(name2))
				{
					//System.out.println("The string " + substring + " is a palindrome.");
					strLongest.add(substring);
				}
			}
		}
		
		String longestPali = strLongest.get(0);
		for(int i = 1; i < strLongest.size() - 1; i++)
		{
			if(longestPali.length() < strLongest.get(i).length())
				longestPali = strLongest.get(i);
		}
		
		System.out.println("The longest palindrome in this string is " + longestPali + " and it is " + longestPali.length() + " characters long.");
	}
	
	public static void main(String[] args) {
		
		longestPalindrome(randomWord);
		
	}
	
}
