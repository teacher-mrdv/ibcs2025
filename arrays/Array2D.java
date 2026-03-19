import java.util.Scanner;

public class Array2D {

	public static void printArray(double[][] array) {
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				System.out.printf("%4.1f ", array[row][column]);
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		double[][] grades = new double[2][4];
		Scanner input = new Scanner(System.in);
		for(int subject = 0; subject < grades.length; subject++) {
			for(int grade = 0; grade < grades[subject].length; grade++) {
				System.out.printf("Subject #%d, Grade #%d = ",
				(subject+1) , (grade+1) );
				double g = input.nextDouble();
				grades[subject][grade] = g;
			}
		}
		printArray(grades);
	}
}

