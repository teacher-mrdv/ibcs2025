/*
 * Denary to Binary converter
 * Command line version
 * IB CS 2025 mdv
 */
public class Den2Bin
{
	public static void main (String[] args)
	{
		if(args.length < 1)
		{
			System.out.println("Error--no input");
			System.exit(1);
		}
		// We will assume that the user kindly privided an integer...
		int denary = Integer.parseInt(args[0]);
		int temp = denary;
		String binary = "";
		// the magic goes here...
		while(temp != 0)
		{
			binary = (temp % 2) + binary;
			temp = temp / 2;
		}
		System.out.println(denary + " base 10 = " + binary + " base 2");
	}
}

