import java.util.Scanner;

public class Factorial {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int factorial = 1;
		// complete this program so that its output is similar to the one
		// at the end of this source code. Try your program with 5, 10, 15 and 20 for values of n
		System.out.print(n + "! = ");
		for(int i = n; i > 0; i--)
		{	factorial = factorial * i;
			System.out.print(i);
			if(i > 1) {
				System.out.print(" x ");
			}
		}
		System.out.println(" = " + factorial);
		input.close();	
	}
}

/* SAMPLE OUTPUT BELOW:

	n = 5
	5! = 5 x 4 x 3 x 2 x 1 = 120

	n = 10
	10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 3628800
	
	
	
*/
