/*
 * Advanced/altgernative input and output methods
 * information on thwe BufferedReader class--
 *  https://www.programiz.com/java-programming/bufferedreader
 * information on the printf method--
 *  https://www.w3schools.com/java/ref_output_printf.asp
 *  https://www.geeksforgeeks.org/java/formatted-output-in-java/
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputDemo2 {
	
	public static void main(String[] args) throws IOException {
		// Buffered and InputStream readers example
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Enter a name: ");
		String name = input.readLine().trim();
		System.out.print("Enter an amount:");
		double amount = Double.parseDouble(input.readLine()); // Convert input to double
		System.out.print("Enter a currency character: ");
		char currency = input.readLine().charAt(0);
		System.out.printf("You entered: %S and %c%,.2f.\n", name, currency, amount);
		
		// Scanner class examples -- keep a close eye on the nextLine() calls and usage!
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter a name: ");
		name = input2.nextLine();
		System.out.print("Enter an amount:");
		amount = input2.nextDouble(); // Convert input to double
		input2.nextLine();
		System.out.print("Enter a currency string: ");
		String currencyString = input2.nextLine();
		System.out.printf("You entered: %S and %s%,.2f.\n", name, currencyString, amount);
		
		// all at once!
		System.out.print("Enter a name, amount and currency: ");
		name = input2.next(); amount = input2.nextDouble(); currencyString = input2.nextLine().trim();
		System.out.printf("You entered: %s and %S%,.2f.\n", name, currencyString, amount);
		
		//input.close();
		input2.close();
		
   }
}
/* OUTPUT:


 */
