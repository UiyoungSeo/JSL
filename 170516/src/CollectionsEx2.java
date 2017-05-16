import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx2 {
	public static void main(String args[]) {
		String simpsons[] = { "B", "H", "L", "M", "H", "M", "R" };
		LinkedList<String> list = new LinkedList(Arrays.asList(simpsons));
		
		// Ensure list sorted
		Collections.sort(list);
		System.out.println(list);

		// Search for element in list
		int index = Collections.binarySearch(list, "R");
		System.out.println("Found R @ " + index);

		// Search for element not in list
		index = Collections.binarySearch(list, "J");
		System.out.println("Didn't find J @ " + index);
	}
}