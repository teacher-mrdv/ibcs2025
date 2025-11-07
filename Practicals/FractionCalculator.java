/*
 * Q2 practice test
 * Fraction calculator
 * Suggested answer
 */

import java.util.Scanner;

public class FractionCalculator {
	
    /* Calculates the Greatest Common Divisor (GCD)
     * of two non-negative integers using the Euclidean algorithm.
     * for simplification purposes
     */
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	// validate a pair of integers to be a valid fraction (no division by zero)
	public static boolean isValidFraction(int numerator, int denominator) {
		return denominator != 0;
	}
	
	// calculate the numerical value of a fraction's numerator and denominator
	public static double decimalValue(int numerator, int denominator) {
		return (double)numerator/denominator;
	}
	
	// calculate the numerical value of a fraction in String form
	public static double decimalValue(String fraction) {
		Scanner parse = new Scanner(fraction);
		int numerator = parse.nextInt();
		int denominator = parse.nextInt();
		return (double)numerator/denominator;
	}
	
	// convert two integers into a String a/b, after simplifying the fraction
	public static String fractionForm(int numerator, int denominator) {
		String fractionForm = "invalid fraction";
		if( isValidFraction(numerator, denominator) ) {
			// we simplify the fraction
			int commonDivisor = gcd(Math.abs(numerator), Math.abs(denominator));
			numerator = numerator / commonDivisor;
			denominator = denominator / commonDivisor;
			fractionForm = numerator + "/" + denominator;
		}
		return fractionForm;
	}
	
    /* Add two fractions
     * Formula: a/b + c/d = (ad + bc) / bd
     * returns a simplified fraction (in a String) representing the sum.
     */
    public static String add(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = (numerator1 * denominator2) + (numerator2 * denominator2);
        int newDenominator = denominator1 * denominator2;
        return fractionForm(newNumerator, newDenominator);
	}

    /* Subtract two fractions
     * Formula: a/b - c/d = (ad - bc) / bd
     * returns a simplified fraction (in a String) representing the difference.
     */
    public static String subtract(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = (numerator1 * denominator2) - (numerator2 * denominator1);
        int newDenominator = denominator1 * denominator2;
        return fractionForm(newNumerator, newDenominator);
    }

    /* Multiply two fractions
     * Formula: a/b * c/d = ac / bd
     * returns a simplified fraction (in a String) representing the product.
     */
    public static String multiply(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = numerator1 * numerator2;
        int newDenominator = denominator1 * denominator2;
        return fractionForm(newNumerator, newDenominator);
    }
    
    /* Divide two fractions
     * Formula: (a/b) / (c/d) = ad / bc
     * returns a simplified fraction (in a String) representing the quotient.
     */
    public static String divide(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = numerator1 * denominator2;
        int newDenominator = denominator1 * numerator2;
        return fractionForm(newNumerator, newDenominator);
    }

	public static String inputFraction() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input numerator   = ");
		int numerator = input.nextInt();
		System.out.print("Input denominator = ");
		int denominator = input.nextInt();
		while(!isValidFraction(numerator, denominator)) {
			System.out.print("Error-denominator cannot be zero. Re-input = ");
			denominator = input.nextInt();
		}
		return fractionForm(numerator, denominator);
	}
	
	public static boolean confirm(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.print(prompt + " (y/n)? ");
		String answer = input.nextLine().trim().toLowerCase();
		answer = answer.substring(0, 1); // only the first character
		return answer.equals("y");
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
			switch(answer) {
				case 'A':
					System.out.println( "\tSum = " + add(numerator1, denominator1, numerator2, denominator2) );
					break;
				case 'S':
					System.out.println( "\tSuibtraction = " + subtract(numerator1, denominator1, numerator2, denominator2) );
					break;
				case 'M':
					System.out.println( "\tMultiplication = " + multiply(numerator1, denominator1, numerator2, denominator2) );
					break;
				case 'D':
					System.out.println( "\tDivision = " + divide(numerator1, denominator1, numerator2, denominator2) );
					break;
				case 'Q':
					exit = true;
				default:
					System.out.println("\tError. Enter option again: ");
					break;
			}
		}
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

