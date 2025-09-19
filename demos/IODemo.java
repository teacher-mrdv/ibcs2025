// for input with the Scanner class
import java.util.Scanner; // or import java.util.*;

public class IODemo {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your age? ");
		int age = input.nextInt();
		// No commas like Python, but + to concatenate outputs
		System.out.println("So you are " + age + " years old");
		/* Or, alternatively, we break the output up into different lines:
		System.out.print("So you are ");
		System.out.print(age);
		System.out.println(" years old");
		*/
		for(int i = 0; i < 5; i++)
		{
			System.out.println("X");
		}
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			System.out.print("X");
		}
		input.close();
	}
}

