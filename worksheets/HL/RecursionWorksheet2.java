import java.util.Scanner;

public class RecursionWorksheet2 {

	public static void strRecur(String s)
	{
		if (s.length() < 11)
		{
			System.out.println(s);
			strRecur(s + "*");
		}
	}

	public static void printString(String s) {
		if (s.length() > 0) {
			//System.out.println(s.substring(1)); // for tracing purposes
			printString(s.substring(1));
			System.out.println(s.substring(0, 1));
		}
	}

	public static void doSomething(int n) {
		if (n > 0) {
			doSomething(n - 1);
			System.out.println(n);
			doSomething(n - 1);
		}
	}

	public static int mystery(int n) {
		if (n < 0)
			return 2;
		else
			return mystery(n - 1) + mystery(n - 3);
	}
	
	public static void main (String[] args) {
		strRecur("wyo");
		System.out.println();
		printString("wyo");
		System.out.println();
		printString("wings");
		System.out.println();
		doSomething(3);
		System.out.println();
		System.out.println( mystery(3) );
	}

}

