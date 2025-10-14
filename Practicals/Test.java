import java.util.*;

public class Test {
	
	public static void main (String[] args) {
		int base, expo;
		double power = 1;
		System.out.println("Marcos");
		Scanner input = new Scanner(System.in);
		base = input.nextInt();
		if(base == 0) {
			System.out.println("Base is zero");
		} else {
			expo = input.nextInt();
			if(expo < 0) {
				System.out.println("exponent is negative");
			} else {
				for(int i = 1; i <= expo; i++) {
					power = power * base;
				}
				System.out.println(base + " to the power of " + expo + " = " + power);
			}
		}
		
	}
}

