import java.util.*;

public class CleanDuplicates {
	
	public static String[] cleanDuplicates(String[] input) {
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < input.length; i++) {
			String item = input[i];
			set.add(item);
		}
		int setSize = set.size();
		String[] backing = new String[setSize];
		return set.toArray(new String[set.size()]);
	}

	
	public static void main (String[] args) {
		String[] before = { "Apple", "Potato", "Orange", "Potato", "Pear", "Apple" };
		System.out.println( Arrays.toString(before) );
		String[] after = cleanDuplicates(before);
		System.out.println( Arrays.toString(after) );
	}
}

