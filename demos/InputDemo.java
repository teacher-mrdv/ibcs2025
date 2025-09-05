/*
 *  Torture for my dear grade 11s :)
 */
 
public class InputDemo
{
	
	public static void main (String[] args)
	{
		if(args.length < 1)
		{	System.out.println("Error-no input " + args.length);
			System.exit(1);
		}		
		for(int i = 0; i < args.length; i++)
		{	System.out.println(i + " " + args[i]);
		}
		System.out.println("Bye.");
	}
}

