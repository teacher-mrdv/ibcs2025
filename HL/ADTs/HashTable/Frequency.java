/* Given an input sentence, determine the frequency of
 * each word, and output the 5 mos common onces
 */
import java.util.*;

public class Frequency {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		// split the sentence into an array of words
		String[] words = sentence.split(" ");
		HashMap<String, Integer> hmap = new HashMap<>();
		// for each loop
		for(String word : words) {
			System.out.print(word + " ");
			if(hmap.containsKey(word)) {
				int value = hmap.get(word);
				hmap.put(word, value +1);
			} else {
				hmap.put(word, 1);
			}
		}
		Object[] keys = hmap.keySet().toArray();
		for(String key : hmap.keySet()) {
			int frequency = hmap.get(key);
			System.out.println("Frequency of " + key + " : " + frequency);
		}
		
	}
}

