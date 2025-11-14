import java.util.Scanner;

public class StringDemo3 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName = input.nextLine();
		int space = fullName.indexOf(' ');
		String firstName = fullName.substring(0, space);
		String lastName  = fullName.substring(space + 1);
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.print(fullName.charAt(0));
		System.out.println(fullName.charAt(space+1));
	}
}

