/*
 * ArrayChallenge1.java
 * 
 * Modify the code below to do the following:
 * 1. Create a String array to store the names of your subjects
 * 2. Input the names of your subjects
 * 3. Write a method to output all the names of your subjects
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

public class ArrayChallenge1 {

	public static final int SUBJECTS = 8;
	
	public static void printArray(double[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double[] grades = new double[SUBJECTS];
		for(int index = 0; index < grades.length; index++)
		{
			System.out.print("Grade #" + (index+1) + ": ");
			double grade = input.nextDouble();
			grades[index] = grade;
		}
		System.out.println(grades);
		printArray(grades);
		System.out.println("Average = " + average(grades) );
	}
}

