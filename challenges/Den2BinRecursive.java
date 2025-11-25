import java.util.Scanner;

public class Den2BinRecursive {

	public static void den2bin(int denary) {
		if(denary > 0) {
			den2bin(denary / 2);
			System.out.print(denary % 2);
		}
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a (denary) integer: ");
		int denary = input.nextInt();
		denary = Math.abs(denary);
		System.out.print(denary + " base 10 = ");
		den2bin(denary);
		System.out.println(" base 2");
	}
}

