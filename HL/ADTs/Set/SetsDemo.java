import java.util.*;
import java.io.*;

public class SetsDemo {
	
	public static void main (String[] args) throws IOException {
		FileReader fileReader = new FileReader("words.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		HashSet<String> words = new HashSet<>();
		String currentline;
		while(reader.ready()) {
			currentline = reader.readLine();
			if(currentline != null) {
				words.add(currentline);
			}
		}
		reader.close();
		boolean has = words.contains("Apple");
		System.out.println("Apple: " + has);
		
	}
}

