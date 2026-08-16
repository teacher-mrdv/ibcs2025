import java.util.*;

public class QueueArray
{
	static final int MAXSIZE = 5;
	static int head = 0;
	static int tail = 0;
	static String[] queue = new String[MAXSIZE];
	
	public static boolean isEmpty()
	{
		return queue[head] == null;
	}
	
	public static boolean isFull()
	{
		return tail == MAXSIZE;
	}
	
	public static void enQueue(String s)
	{
		if(isFull() == false)
		{
			queue[tail] = s;
			tail++;
		}
	}

	public static String deQueue()
	{
		String output = queue[head]; // save head value: 1 mark
		for(int i = 0; i < tail-1; i++) // loop: 2 marks; 1 for loop, 1 for < tail-1
		{
			queue[i] = queue[i+1]; // move up the Q: 1 mark
		}
		tail--; // move up the tail: 1 mark
		return output; // return the head value: 1 mark
	}
	
	public static void printQueue()
	{
		// output format: 1 mark
		System.out.print("Head");
		for(int i = head; i < tail; i++) // loop: 2 marks: 1 for loop, 1 for < tail
		{
			System.out.print(" <- " + queue[i]); // Q output: 1 mark
		}
		System.out.println(" <- Tail");
	}
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnqueuing");
		printQueue();
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter name to queue: ");
			String n = in.nextLine();
			enQueue(n);
			printQueue();
			System.out.println();
		}
		System.out.println("\nDequeuing");
		for(int i = 0; i < 5; i++)
		{
			deQueue();
			printQueue();
		}
	}
}

