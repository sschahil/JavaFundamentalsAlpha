import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest {
	
	private static final String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
	private List<String> list;
	
	public BinarySearchTest() {
		
		list = new ArrayList<String>(Arrays.asList(colors));
		Collections.sort(list);
		System.out.printf("Sorted ArrayList: %s\n", list);
	}
	
	private void search() {
		
		printSearchResults( colors[3] );
		printSearchResults( colors[0] );
		printSearchResults( colors[7] );
		printSearchResults( "aqua" );
		printSearchResults( "gray" );
		printSearchResults( "teal" );
	}
	
	private void printSearchResults( String key ) {
		
		int result = 0;
		
		System.out.printf("\nSearching for: %s\n", key);
		result = Collections.binarySearch(list, key);
		
		if(result >= 0)
			System.out.printf("Found at index %d\n", result);
		else
			System.out.printf("Not Found (%d)\n", result);
	}
	
	public static void main(String[] args) {
		
		BinarySearchTest binarySearchTest = new BinarySearchTest();
		binarySearchTest.search();
	}
}
