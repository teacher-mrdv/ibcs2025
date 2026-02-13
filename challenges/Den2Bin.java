/*
 * Denary to Binary converter
 * Command line version
 * IB CS 2025 mdv
 */
import java.util.Scanner;

public class Den2Bin
{
	public static void main (String[] args)
	{
		int denary;
		if(args.length < 1)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Input a denary integer: ");
			denary = input.nextInt();
		} else {
			denary = Integer.parseInt(args[0]);
		}
		int temp = Math.abs(denary);
		String binary = "";
		// the magic goes here...
		while(temp != 0)
		{
			binary = (temp % 2) + binary; // prepend instead of append when concatenating the binary digit
			temp = temp / 2;
		}
		System.out.println(denary + " base 10 = " + binary + " base 2");
	}
}

