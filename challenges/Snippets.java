
public class Snippets {
	
	public static void main (String[] args) {
		int n, r, result = 0;
		n = 12345;
		while(n > 0)
		{	r = n % 10;
			result = result * 10 + r;
			n = n / 10;
		}
			System.out.println(result);
	}
}

