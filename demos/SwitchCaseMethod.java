/*
 * Switch-Case Java demo
 * Definitively not inspired by
 * https://www.geeksforgeeks.org/switch-statement-in-java/
 * 
 */
 
public class SwitchCaseMethod
{

	public static String numberToDay(int dayNumber)
	{
		String dayString = ""; // empty String
		switch (dayNumber)
        {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
			case 5:
				dayString = "Friday";
				break;
			case 6:
				dayString = "Saturday";
				break;
			case 7:
				dayString = "Sunday";
				break;
			// Default case
			default:
				dayString = "Invalid day";
				break; // optional as it's the last case anyway
        } // end switch
        return dayString;
	}

	public static void dayOfTheWeek(int dayNumber)
	{
		String dayOfTheWeek = "";
		// Multiple cases without break statements
        switch (dayNumber)
        {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				dayOfTheWeek = "Weekday :(";
				break;
			case 6:
			case 7:
				dayOfTheWeek = "Weekend :)";
				break;
			default:
				dayOfTheWeek = "Invalid day";
				break;
        }
        System.out.println( numberToDay( dayNumber ) + " is a " + dayOfTheWeek);
	}
	
	public static void main (String[] args)
	{
		int dayNumber = IBIO.inputInt("Enter day of the week (1=Monday; 7=Sunday): ");
        System.out.println("Happy " + numberToDay(dayNumber));
        //numberToDay(5); does it job, but no output
        dayOfTheWeek(dayNumber);
    }
}

