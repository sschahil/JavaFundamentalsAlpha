import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	
	private static final String[] names = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};
	
	public SortedSetTest() {
		
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));
		
		System.out.println("Sorted Set: ");
		printSet(tree);
		
		System.out.println("\nHeadSet (\"orange\"): ");
		printSet(tree.headSet("orange"));
		
		System.out.println("TailSet (\"orange\"): ");
		printSet(tree.tailSet("orange"));
		
		System.out.printf("first: %s\n", tree.first());
		System.out.printf("last: %s\n", tree.last());
	}
	
	private void printSet(SortedSet<String> set) {
		
		for(String s : set) {
			System.out.print(s + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		new SortedSetTest();
	}
}
