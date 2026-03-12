import java.util.Scanner;

public class ArrayDemo0
{
	public static final int SUBJECTS = 8;

	public static void printArray(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{	System.out.println(i + " : " + array[i]);
			/*if(i < array.length - 1)
			{	System.out.print(", ");
			}*/
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
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
	}
}

