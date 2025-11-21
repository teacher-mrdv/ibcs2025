/*
 * Quarter 2 Practical programming test
 * suggested answer
 * 
 * Math methods allowed: pow(), sqrt()
 * String methods allowed: indexOf(), replace(), substring()
 * Scanner class recommended method: nextDouble()
 * 
 */
import java.util.Scanner;

public class Q2PTest {
	
	public static String createPoint(String name, double x, double y) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "";
	}
	
	public static double distanceFromOrigin(double x, double y) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}
	
	public static double slope(double x1, double y1, double x2, double y2) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}
		
	public static double magnitude(double x, double y) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}
	
	public static String midpoint(double x1, double y1, double x2, double y2) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "M";
	}	
	
	public static String add(double x1, double y1, double x2, double y2) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "SUM";
	}

	public static String subtract(double x1, double y1, double x2, double y2) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "SUB";
	}
	
	public static String scalarMultiply(double scalar, double x, double y) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "SML";
	}

	public static String extractName(String point) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return "";
	}

	public static double extractX(String point) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}

	public static double extractY(String point) {
		// your code goes here
		// remember that you HAVE TO change the return statement, too!

		return 0;
	}

	// DO NOT MODIFY THE CODE BELOW
	public static void main(String[] args) {
		System.out.println( "2D points");
		System.out.println( "#1 -> createPoint(\"P\", 3, 4)   = P(3.0, 4.0)        = " +
			" OK: " + "P(3.0, 4.0)".equals(createPoint("P", 3, 4)));
		System.out.println( "#2 -> distanceFromOrigin(5,-9) = 10.295630140987    = " +
			" OK: " + (distanceFromOrigin(5, -9) == 10.295630140987) );
		System.out.println( "#3 -> distance(-3, 5, 7,-1)    = 11.661903789690601 = " +
			" OK: " + (distance(-3, 5, 7,-1) == 11.661903789690601) );
		System.out.println( "#4 -> slope(2, 3, 6, 4)        = 0.25               = " +
			" OK: " + (slope(2, 3, 6, 4) == 0.25) );
		System.out.println( "#5 -> vector magnitude(4, 5)   = 6.4031242374328485 = " +
			" OK: " + (magnitude(4, 5) == 6.4031242374328485));
		System.out.println( "#6 -> midpoint(-3, 5, 8, -1)   = M(2.5, 2.0)        = " +
			" OK: " + (midpoint(-3, 5, 8, -1).equals("M(2.5, 2.0)")));
		System.out.println( "#7 -> add(8, 13, 26, 7)        = SUM(34.0, 20.0)    = " +
			" OK: " + (add(8, 13, 26, 7).equals("SUM(34.0, 20.0)")));
		System.out.println( "#8 -> subtract(4, 5, 12, 2)    = SUB(-8.0, 3.0)     = " +
			" OK: " + (subtract(4, 5, 12, 2).equals("SUB(-8.0, 3.0)")));
		System.out.println( "#9 -> scalarMultiply(3,12,2.5) = SML(36.0, 7.5)     = " +
			" OK: " + (scalarMultiply(3, 12, 2.5).equals("SML(36.0, 7.5)")));
		String point = createPoint("add", 5.5, 2.1);
		System.out.println( "\n#X -> for String point = createPoint(\"add\", 5.5, 2.1):");
		System.out.println( "      extractName(point) = \"ADD\" : OK = " + extractName(point).equals("ADD"));
		System.out.println( "      extractX(point)    = 5.5   : OK = " + (extractX(point) == 5.5));
		System.out.println( "      extractY(point)    = 2.1   : OK = " + (extractY(point) == 2.1));
	}
}
