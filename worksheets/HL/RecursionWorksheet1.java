import java.util.Scanner;

public class RecursionWorksheet1 {

	public static int sum(int n) {
		//System.out.print(n + " ");
		//System.out.println(n==1);
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

	public static int result(int n) {
		if (n == 1) {
			return 2;
		} else {
			return 2 * result(n - 1);
		}
	}

public static int f(int k, int n) {
	if (n == k)
	   return k;
	else
		if (n > k)
			return f(k, n - k);
		else
			return f(k - n, n);
	}

	public static int mystery(int n, int a, int d) {
		if (n == 1)
			return a;
		else
			return d + mystery(n - 1, a, d);
	}
	
	public static void main (String[] args) {
		System.out.println("\nTracing Recursive Algorithms Worksheet #1\nProblem #1");
		check( 1, sum(5) );
		//System.out.println( sum(5) );
		
		System.out.println("\nProblem #2");
		check( 2, result(5) );
		
		System.out.println("\nProblem #3");
		check( 3, mystery(3, 2, 6) );
		
		System.out.println("\nProblem #4");
		check( 4, f(6, 8) );

	}

	
	public static void check(int question, int answer) {
		Scanner input = new Scanner(System.in);
		String outcome = "";
		System.out.printf("\tYour result after tracing question #%,d: ", question);
		int yourAnswer = input.nextInt();
		System.out.println("\tAnswer from the recursive method: " + answer);
		if(yourAnswer != answer) {
			outcome = "DO NOT ";
		}
		System.out.printf("\tYour answer and the answer from the recursive method in this code %sMATCH.\n", outcome);
		if(yourAnswer != answer) {
			System.out.println("\tPlease check your tracing and/or your code for errors.");
		} else {
			System.out.println("\tWell done, things look good!");
		}
	}
}

