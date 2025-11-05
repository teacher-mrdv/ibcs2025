public class ForDemo2
{
	public static void main(String[] args)
	{	
		for(int i = 1; i <= 20; i=i+1)
		{	System.out.print(i);	// or replace these two lines with
			System.out.print(" "); //  print(i + " ");
		}
		System.out.println();
		//System.out.println(i); // <--this causes an error, as i is a local variable to the for loop
		System.out.println("\n");
		// while version of the for loop above
		int count;
		for(count = 1; count <= 20; count++)
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
		System.out.println("\nDescending loop");
		System.out.print(10);
		int j;
		for(j = 9; j > 0; j--)
		{
			System.out.print("," + j);
		}
		System.out.println("\n>>>" + j);
		System.out.println("\n***Boom***");
		System.out.println("\nAscending loop");
		// we can reuse j again
		for(j = 0; j < 10; j++)
		{
			System.out.print(j + " ");
		}
		System.out.println("\n>>>" + j);
		System.out.println("\tThat's all folks!");
	}
}

