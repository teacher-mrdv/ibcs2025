/*
 *  Torture for my dear grade 11s :)
 *  Command line input
 *  example: from the terminal and folder where you have this code:
 *  Compile the code with javac InputDemo.java
 *  Execute the code with java InputDemo a b c
 * 						  java InputDemo 1 2 3
 * 
 */
 
public class InputDemo
{
	
	public static void main (String[] args)
	{
		System.out.println(5 +" HI");
		if(args.length < 1)
		{	System.out.println("Error-no input " + args.length);
			System.exit(1);
		}
		// outputs the arguments passed when running the code in the terminal/command line. Read comments above.
		for(int i = 0; i < args.length; i++)
		{	System.out.println(i + " " + args[i]);
		}
		System.out.println("Bye.");
	}
}

