//Write a function to find out longest palindrome in a given string?


public class StringQuestion4 {

	private static String randomWord = "heilikahannahlkjilijloollksjdlkji";
	
	public static void longestPalindrome(String word) {
		
		String[] substring = new String[500];
		
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = (i + 1); j < (word.length() - (i + 1)); j++ )
			{
				substring[i] = word.substring(i,j);
				int index = 0;
				char[] charArray = new char[substring[i].length()];
				
				for(int k = (substring[i].length() - 1); k >= 0; k--)
				{
					charArray[index] = substring[i].charAt(k);
					index++; 
				}
				
				String name2 = new String(charArray);
				
				
				if(substring[i].equals(name2))
					System.out.println("The string " + substring[i] + " is a palindrome.");
			}
		}
		
		for(int a = 0; a < substring.length; a++)
		{
			String longestPalindrome
		}
		
	}
	
	public static void main(String[] args) {
		
		longestPalindrome(randomWord);
		
	}
	
}
