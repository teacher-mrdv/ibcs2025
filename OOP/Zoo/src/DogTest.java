public class DogTest
{
    public static void main(String[] args)
    {
        Dog dici = new Dog("Diciembre", 2022, "Pomeranio");
        System.out.println(dici);	// this tests toString() implicitly
        // using a method inherited from the parent class, Animal
        dici.setName("December");
        // using methods only available to the Dog class
        dici.setBreed("Pomeranian");
        System.out.println(dici.getBreed());
        System.out.println(dici);
        dici.eat();
        dici.talk();
    }
}
