import java.util.Scanner;

public class ChallengeQ2 {

	public static String den2bin(int denary) {
		denary = Math.abs(denary);
		if(denary < 0) {
			denary = denary * -1;
		}
		String binary = "";
		while(denary > 0) {
			binary = (denary % 2) + binary;
			denary = denary / 2;
		}
		return binary;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a (denary) integer: ");
		int denary = input.nextInt();
		String binary = den2bin(denary);
		System.out.println(denary + " base 10 = " + binary + " base 2");
	}
}

