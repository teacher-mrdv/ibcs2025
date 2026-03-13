/*
 * ArrayChallenge1.java
 * 
 * Modify the code below to do the following:
 
 * 4. When inputting the grade for your subject, print the subject name
 * 5. Write a method to calculate and return the average grade for all subjects
 * 6. Write a method to return the lowest grade
 * 7. Write a method to return the highest grade
 * 8. Write a method to return the name of the subject where you got the lowest grade
 * 9. Write a method to return the name of the subject where you got the highest grade
 * 10. Write a method to print the name of the subject and the grade you got for that subject beside the name of the subject, e.g.
 *	   Computer Science 5.2
 *
 * Submit your ArrayChallenge1.java file by the end of the lesson
 *
 * Have a happy weekend, or study arrays from the textbook or PDF guide/notes in the learning portal
 * 
 */
import java.util.Scanner;

public class ArrayChallenge1 {

	public static final int MAXSUBJECTS = 8;
	
	public static void printArray(double[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public static void printArray(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		//double[] grades = new double[MAXSUBJECTS];
		//String[] subjectNames = new String[MAXSUBJECTS];
		double[] grades = { 5.5, 6.6, 7.7, 4.4, 5.2, 6, 4};
		String[] subjectNames = { "Maths AI HL", "Spanish A LL HL", "Comp Sci HL", "Psych SL", "Digital Soc SL", "Engish A LL SL", "TOK", "PE" };
		/*for(int index = 0; index < subjectNames.length; index++) {
			System.out.print("Subject #" + (index+1) + ": ");
			subjectNames[index] = input.nextLine();
		}*/
		printArray(subjectNames);
		/*for(int index = 0; index < grades.length; index++) {
			System.out.print("Grade #" + (index+1) + ": ");
			double grade = input.nextDouble();
			grades[index] = grade;
		}*/
		System.out.println(grades);
		printArray(grades);
		//System.out.println("Average = " + average(grades) );
	}
}

