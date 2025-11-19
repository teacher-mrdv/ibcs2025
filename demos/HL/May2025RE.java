
public class May2025RE {

	public static int refn(int n) {
		System.out.println(n);
		if (n < 1) {	// base case
			return 1;
		} else {
			if (n % 2 == 0) {
				return refn(n-1)-n;	// recursive call
			} else {
				return refn(n-1)+n;	// recursive call
			}
		}
	}
	
	public static void main (String[] args) {
		System.out.println( refn(5) );
	}
}

