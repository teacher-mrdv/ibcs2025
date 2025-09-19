
public class RecursionDemos {

	public static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}

	public static int fibo(int n) {
		System.out.println( ">>> " + n );
		if(  n == 0 )
			return 0;
		else if( n == 1 )
			return 1;
		else
			return fibo(n - 2) + fibo(n - 1);
	}

	public static void count(int n) {
		if( n == 0 )
			return;
		//System.out.println(n); // tail recursion  (recursive call last)
		count(n-1);
		System.out.println(n);		// head recursion (recursive call first)
}

	public static void count(int start, int end) {
		if( start == end+1 )
			return;
		System.out.println(start);
		count(start+1, end);
	}
	
	public static void main (String[] args) {
		System.out.println( factorial(4) );
		System.out.println();
		System.out.println( fibo(4) );
		System.out.println();
		count(4);
		System.out.println();
		count(1, 4);
	}
}

