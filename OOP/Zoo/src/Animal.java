import java.util.Date;	// note this is DEPENDENCY

public class Animal {
	
	private String name;
	private int yearOfBirth;

	public Animal(String name, int yob) {
		this.name = name;
		yearOfBirth = yob;
	}

	public String getName() { // accessor
		return name;
	}

	public int getYearOfBirth() { // accessor
		return yearOfBirth;
	}

	// mutators/modifiers
	public void setName(String name) {
		this.name = name;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	/*
	public void setYearOfBirth(int yob) {
		yearOfBirth = yob;
	}
	*/

	public void eat() {
		System.out.println("Munch!");
	}

	public void talk() {
		System.out.println("Talk!");
	}

	public String toString() {
		String output = "[ " + this.getClass().getName() + " ]\t" +
						"Name: " + name +
						"\tYear of birth: " + yearOfBirth;
		return output;
	}

	// calculates the current age of the animal
	public int calculateAge() {
		Date today = new Date(); // current date
		int currentYear = 1900 + today.getYear();
		return currentYear - yearOfBirth;
	}

}

