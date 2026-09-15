import java.util.ArrayList;
import java.util.HashMap;

// Hashtable demo, p. 475 onwards
public class HashTableDemo {
	
    public static void main(String[] args) {
		// n stands for the size/length of the data structure
		// parallel AL O(n), linear search required to find a key
		// and access the value pair by index
		// remember to examine the code!
        ArrayList<String> key = new ArrayList<>();
        ArrayList<Integer> value = new ArrayList<>();
        key.add("X"); key.add("Y"); key.add("Z");
        value.add(1); value.add(2); value.add(2);
        value.set(2,3);
        System.out.println("\nParallel ArrayLists");
        System.out.println(key);
        System.out.println(value);
        System.out.println(key.get(2) + " " + value.get(2));
        // parallel arrays example, similar O(n) case as the AL
        System.out.println("Parallel Arrays");
        String[] arr = {"x", "y", "z"};
        int[] valArr = {1, 2, 3};
        System.out.println(arr[2] + " " + valArr[2]);
        
        // O(1)
        System.out.println("\nHash Table (Java HashMap)");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("X", 5);
        System.out.println(hm);
        hm.put("X", 6);
        System.out.println(hm);
        hm.put("Y", 7);
        hm.put("Z", 8);
        System.out.println(hm);
        System.out.println("Y -> " + hm.get("Y"));
        System.out.println("7 -> " + hm.get(7));
        // NOT bidirectional
    }
}
