/*
 * This code demonstrates how to avoid variable scope issues
 * and adds the example of a (global) constant in Java
 * 
 * information on the printf method--
 *  https://www.w3schools.com/java/ref_output_printf.asp
 *  https://www.geeksforgeeks.org/java/formatted-output-in-java/
 */
public class MethodDemo
{
	public static final double GST = 0.09;

	/**
		calculates net price using the GST global constant defined on line #7 of this class.
		@param price double containing the price before GST
		@return net price
	*/
	public static double calculateGST(double price)
	{
		double priceIncludingGST = price + (price * GST);
		return priceIncludingGST;
	}

	/** calculates net price given a custom, specific tax, overriding the method that uses the GST constant.
		@param price double containing the price before GST
		@param tax double containing a specific tax, not the global constant from this class (GST)
		@return net price
	*/
	public static double calculateGST(double price, double tax)
	{
		double priceIncludingGST = price + (price * tax);
		return priceIncludingGST;
	}

	// MAIN METHOD //
	public static void main (String[] args)
	{
		double price = 1234;
		System.out.println("Prevailing GST   = $" + GST );
		System.out.println("Price before GST = $" + price );
		System.out.println(">>> Net Price    = $" +
			calculateGST(price) );
		System.out.printf (">>> Net Price    = $%,.2f",
			calculateGST(price) );
	}
}

