/*
 * Q2 practice test
 * Fraction calculator
 * 
 */

import java.util.Scanner;

public class FractionCalculatorTest {
	
    /* Calculates the Greatest Common Divisor (GCD)
     * of two non-negative integers using the Euclidean algorithm.
     * for simplification purposes
     */
	public static int gcd(int a, int b) {
		// your code goes here 1
	}
	
	// validate a pair of integers to be a valid fraction (no division by zero)
	public static boolean isValidFraction(int numerator, int denominator) {
		// your code goes here 2
	}
	
	// calculate the numerical value of a fraction's numerator and denominator
	public static double decimalValue(int numerator, int denominator) {
		// your code goes here 3
	}
	
	// calculate the numerical value of a fraction in String form "a/b"
	// hint: use Scanner(fraction)!
	public static double decimalValue(String fraction) {
		// your code goes here 4
	}
	
	// convert two integers into a String in "a/b" format, after simplifying the fraction
	public static String fractionForm(int numerator, int denominator) {
		String fractionForm = "invalid fraction";
		if( isValidFraction(numerator, denominator) ) {
			// your code goes here 5
		}
		return fractionForm;
	}
	
    /* Add two fractions
     * Formula: a/b + c/d = (ad + bc) / bd
     * returns a simplified fraction (in a String) representing the sum.
     */
    public static String add(int numerator1, int denominator1, int numerator2, int denominator2) {
        // your code goes here 6
        return fractionForm(newNumerator, newDenominator);
	}

    /* Subtract two fractions
     * Formula: a/b - c/d = (ad - bc) / bd
     * returns a simplified fraction (in a String) representing the difference.
     */
    public static String subtract(int numerator1, int denominator1, int numerator2, int denominator2) {
        // your code goes here 7
    }

    /* Multiply two fractions
     * Formula: a/b * c/d = ac / bd
     * returns a simplified fraction (in a String) representing the product.
     */
    public static String multiply(int numerator1, int denominator1, int numerator2, int denominator2) {
        // your code goes here 8
    }
    
    /* Divide two fractions
     * Formula: (a/b) / (c/d) = ad / bc
     * returns a simplified fraction (in a String) representing the quotient.
     */
    public static String divide(int numerator1, int denominator1, int numerator2, int denominator2) {
        // your code goes here 9
    }
	
	public static void menu(int numerator1, int denominator1, int numerator2, int denominator2) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		char answer;
		while(!exit) {
			System.out.println("\nOperations Menu");
			System.out.println("\tA-Add");
			System.out.println("\tS-Subtract");
			System.out.println("\tM-Multiply");
			System.out.println("\tD-Divide");
			System.out.println("\tQ-Quit");
			System.out.print("\t\tEnter your option: ");			
			// switch/case only accepts ints or chars
			answer = input.nextLine().toUpperCase().charAt(0);
			// -------------------------------------------------
			// your code goes here, the switch/case structure 10
			// -------------------------------------------------
			}
		}
	}
	
	
	public static boolean confirm(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.print(prompt + " (y/n)? ");
		String answer = input.nextLine().trim().toLowerCase();
		answer = answer.substring(0, 1); // only the first character
		return answer.equals("y");
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		boolean again = true;
		while(again) {
			System.out.println("Fraction Calculator");
			System.out.println("Please input two valid fractions");
			System.out.println("Input Fraction #1 ");
			System.out.print("\tInput numerator   = ");
			int numerator1 = input.nextInt();
			System.out.print("\tInput denominator = ");
			int denominator1 = input.nextInt();
			while(denominator1 == 0) {
				System.out.print("\tError-denominator cannot be zero. Re-input = ");
				denominator1 = input.nextInt();
			}
			System.out.println("Input Fraction #2 ");
			System.out.print("\tInput numerator   = ");
			int numerator2 = input.nextInt();
			System.out.print("\tInput denominator = ");
			int denominator2 = input.nextInt();
			while(denominator2 == 0) {
				System.out.print("\tError-denominator cannot be zero. Re-input = ");
				denominator2 = input.nextInt();
			}
			System.out.println("Fraction #1 is " + fractionForm(numerator1, denominator1));
			System.out.println("Fraction #2 is " + fractionForm(numerator2, denominator2));
			menu(numerator1, denominator1, numerator2, denominator2);
			again = confirm("\nAnother operation");
			
		}
	}
}

