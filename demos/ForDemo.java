public class ForDemo
{
	public static void main(String[] args)
	{
		int counter;
		for(counter = 0; counter < 10; counter++)
		{	System.out.print(counter + " ");
		}
		System.out.println("\n>>>" + counter);
		
		for(int i = 1; i <= 20; i=i+1)
		{
			System.out.print(i);	// or replace these two lines with
			System.out.print(" "); //  print(i + " ");
		}
		counter = 1;
		while(counter <= 20) {
			System.out.print(counter + " ");
			counter = counter + 1;
		}
		System.out.println(counter);

		
		//System.out.println(i);
		System.out.println("\n"); // "\n" = goes down one line (new line)
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

