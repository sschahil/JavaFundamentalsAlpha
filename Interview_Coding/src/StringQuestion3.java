//Print all permutation of String both iterative and Recursive way?

import java.util.*;

public class StringQuestion3 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s;
		
		System.out.println("Enter a String");
		s = input.nextLine();
		
		iterativePrint(s);
	}
	
	public static void iterativePrint(String str) {
		
		String iter = str;
		int permutation = 1, k = 1, m = 0;
		char[] char1 = iter.toCharArray();
		char temp = 0;
		
		for(int i = 1; i <= iter.length(); i++)
		{
			permutation *= i; 
		}
		
		System.out.println(permutation);
		
		for(int i = 0; i < permutation - 1;)
		{
			
			int j = 0;
			while(j != permutation/iter.length())
			{
				while(k != iter.length() - 1) 
				{
					String swappedString = new String(char1);
					System.out.println(swappedString);
					 
	                
	                temp = char1[k];
	                char1[k] = char1[k+1];
	                char1[k+1] = temp;
	               
	                j++;
	 
	                // Increment permutation count
	                i++;
	 
	                // Increment 'j' to swap with next character
	                k++;
				}
				
				k = 1;
			}
			
			m++;
			
			if(m == iter.length())
				break;
			
			temp = char1[0];
            char1[0] = char1[m];
            char1[m] = temp;
			
		}
		
	}
	
}
