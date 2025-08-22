
public class InputDemo
{
	
	public static void main (String[] args)
	{
		if(args.length < 1)
		{
			System.out.println("Error-no input");
			System.exit(1);
		}
		System.out.println(args[0]);
	}
}

