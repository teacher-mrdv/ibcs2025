
public class StringDemo2 {
	
	public static void main (String[] args) {
		String point = "MID(5.6, 8.9)";
		int indexOfOpenBracket = point.indexOf('(');
		int indexOfComma = point.indexOf(',');
		int indexOfSpace = point.indexOf(' ');
		int indexOfCloseBracket = point.indexOf(')');
		String name = point.substring(0, indexOfOpenBracket);
		System.out.println(name);
		String xString =
			point.substring(indexOfOpenBracket+1, indexOfComma);
		System.out.println(xString);
		String yString =
			point.substring(indexOfSpace+1, indexOfCloseBracket);
		System.out.println(yString);
		double x = Double.parseDouble(xString);
		double y = Double.parseDouble(yString);
		System.out.println(x + " " + y + " (double)");
	}
}

