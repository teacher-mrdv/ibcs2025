public class ForDemo
{
	public static void main(String[] args)
	{	
		for(int i = 1; i <= 20; i=i+1)
		{	System.out.print(i);	// or replace these two lines with
			System.out.print(" "); //  print(i + " ");
		}
		// System.out.println(i); // <--this causes an error, as i is a local variable to the for loop
		System.out.println("\n");
		// while version of the for loop above
		int counter = 1;
		while(counter <= 20) {
			System.out.print(counter + " ");
			counter = counter + 1;
		}
		System.out.println("\n>>>" + counter);
		System.out.println();
		// if we need to use the counter outside the for loop,
		// we have to declare it before and outside the loop.
		int count;
		for(count = 0; count < 10; count++)
		{	System.out.print(count + " ");
		}
		System.out.println("\n>>>" + count);
		// counter reaches 21, and the loop exits/stops
		
		System.out.println();
		System.out.print(1);
		for(int i = 3; i <= 20; i=i+2)
		{
			System.out.print("," + i);
		}
		System.out.println("\n");
		System.out.print(10);
		for(int i = 9; i > 0; i--)
		{
			System.out.print("," + i);
		}
		
		System.out.println("\n\n ***Boom***");
		System.out.println("\tThat's all folks!");
	}
}

