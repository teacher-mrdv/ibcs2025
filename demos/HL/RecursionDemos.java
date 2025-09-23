
public class RecursionDemos {

	// factorial example
	public static int factorial(int n) {
		if(n == 0) {
			System.out.print("= ");
			return 1;
		} else {
			System.out.print(n + " ");
			if( n > 1) {
				System.out.print("x ");
			}
			return n * factorial(n-1);
		}
	}

	// tree recursion
	public static int fibo(int n) {
		System.out.println( ">>> " + n );
		if(  n == 0 )
			return 0;
		else if( n == 1 )
			return 1;
		else
			return fibo(n - 2) + fibo(n - 1);
	}

	public static void countUp(int n) {
		if( n == 0 )
			return;
		countUp(n-1);
		System.out.println(n);		// head recursion (recursive call first)
	}

	public static void countDown(int n) {
		if( n == 0 )
			return;
		System.out.println(n); // tail recursion  (recursive call last)
		countDown(n-1);
	}

	public static void count(int start, int end) {
		if( start == end+1 ) // so that we do print/process the end
			return;
		System.out.print(start + " ");
		count(start+1, end);
	}

	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	public static void main (String[] args) {
		System.out.println( "5! = " + factorial(5) );
		System.out.print( "4! = " );
		System.out.println( factorial(4) );
		
		System.out.println();
		System.out.println( "\nTerm 4 of the Fibonacci sequence = " + fibo(4) );
		System.out.println("\nCount UP to 4:");
		countUp(4);
		System.out.println("\nCount DOWN to 4:");
		countDown(4);
		System.out.println("\nCount from 1, to 4:");
		count(1, 4);
		System.out.println("\nGCD of 1071 and 462 = ");
		System.out.println( gcd(1071, 462) );
	}
}

