import java.io.*;
import java.util.ArrayList;

public class NumbersSort {
	
	public static void main(String[] args){
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
		File file = new File("random_numbers.txt");
		BufferedReader reader = null;
		
		try 
		{
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			
			while((text = reader.readLine()) != null)
			{
				randomArray.add(Integer.parseInt(text));
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException f)
		{
			f.printStackTrace();
		}
		finally
		{
			try 
			{
		        if (reader != null) 
		        {
		            reader.close();
		        }
		    } 
			catch (IOException e) {}
		}
		
		System.out.println(randomArray);
		
		sortArray(randomArray);
	}
	
	
	public static void sortArray(ArrayList<Integer> list) {
		
		int temp = 0;
		int index = 0;
		
		while(index < 19)
		{
			if(list.get(index).equals(list.get(index + 1)))
			{
				list.set(index, list.get(index));
				continue;
			}
			
			for(int i = 0; i < list.size() - 1; i++)
			{
				if(list.get(i) > list.get(i + 1))
				{
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set((i + 1) , temp); 
				}
			}
			index++;
		}
		
		System.out.println(list);
	}
		
}
