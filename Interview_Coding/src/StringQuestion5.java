//How to find the first non-repeated character in a String


public class StringQuestion5 {

	static String randomWord = "kkkkkkkkklllllllaakj";
	
	public static void notSameCharacter(String word) {
		
		char[] charWord = randomWord.toCharArray();
		int index = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(charWord[i] != charWord[i+1])
			{
				index = i + 1;
				break;
			}
		}
		
		System.out.println("The first non-repeated character is: " + charWord[index] + ".");
	}
	
	public static void main(String[] args) {
		
		notSameCharacter(randomWord);
		
	}
	
}
