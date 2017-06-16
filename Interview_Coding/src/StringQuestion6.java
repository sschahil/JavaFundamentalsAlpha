//How to check if a given String is an anagram

public class StringQuestion6 {

	static String name = "deirqua";
	static String word = "aquired";
	
	public void checkForAnagram(String str1, String str2) {
	
		boolean check = false;
		System.out.println(str1 + " " + str2);
		if(str1.equals(str2))
		{
			check = true;
		}
		
		if(check)
			System.out.println("These two strings " + name + " and " + word + " are an anagram.");
		else
			System.out.println("These two strings " + name + " and " + word + " are not an anagram.");
		
	}
	
	public void sortString(String str1, String str2) {
		
		str1.toLowerCase();
		str2.toLowerCase();
		
		int index = 0;
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		char temp1;
		char temp2;
		
		while(index < char1.length)
		{
			for(int j = 0; j < str1.length() - 1; j++)
			{
				if(char1[j] > char1[j + 1])
				{
					temp1 = char1[j];
					char1[j] = char1[j + 1];
					char1[j + 1] = temp1;
				}
			}
			index++;
		}
		
		index = 0;
		while(index < char2.length)
		{
			for(int j = 0; j < str2.length() - 1; j++)
			{
				if(char2[j] > char2[j + 1])
				{
					temp2 = char2[j];
					char2[j] = char2[j + 1];
					char2[j + 1] = temp2;
				}
			}
			index++;
		}
		
		String newStr1 = new String(char1);
		String newStr2 = new String(char2);
		
		checkForAnagram(newStr1, newStr2);
		
	}
	
	public static void main(String[] args) {
		
		StringQuestion6 strNew = new StringQuestion6();
		
		strNew.sortString(name, word);
		
	}
		
}
