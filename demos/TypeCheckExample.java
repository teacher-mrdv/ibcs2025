import java.util.Scanner;

public class TypeCheckExample {
	
    public static int inputInteger(String prompt) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        // integer type check validation
        if (!input.hasNextInt()) {
            String invalidInput = input.next(); // Clear the invalid input from the scanner
            throw new Exception("Error: " + invalidInput + " is not a valid integer.");
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        while (true) {
            try {
                int number = inputInteger("Enter an integer: ");
                System.out.println("Valid integer received: " + number);
                break; // Exit loop on valid input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


