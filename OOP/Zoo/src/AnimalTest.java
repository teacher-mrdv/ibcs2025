
public class AnimalTest {
	
	public static void main (String[] args) {
		Animal goldie = new Animal("Koi", 2021);
		System.out.println(goldie);
		System.out.println( goldie.getName() );
		System.out.println( goldie.getYearOfBirth() );
		goldie.setName("Kai");
		System.out.println( goldie.getName() );
		goldie.setYearOfBirth(2022);
		System.out.println( goldie.getYearOfBirth() );
		System.out.println(goldie);
		System.out.println(goldie.getName() + " is " + goldie.getAge());
		Animal woof = new Animal("Fido", 2020);
		System.out.println(woof);

	}

}

