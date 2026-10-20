
interface Drivable {
	void start();
	void stop();
}

interface MakesNoise {
	void makeNoise();
}

class Car implements Drivable, MakesNoise {
	String color;

	Car(String color) {
		this.color = color;
	}

	@Override
	public void start() {
		System.out.println(color + " Car Gas Engine Vroom Vroom");
	}
	
	@Override
	public void stop() {
		System.out.println("Insert tire screeching noises");
	}

	@Override
	public void makeNoise() {
		System.out.println("Vroom Vroom");
	}
}

class Bicycle implements Drivable {
	int wheelSize;

	Bicycle (int wheelSize) {
		this.wheelSize = wheelSize;
	}
	
	@Override
	public void start() {
		System.out.println(wheelSize + " Bike pedal");
	}

	@Override
	public void stop() {
		System.out.println("Bike brake");
	}
}

class Dog implements MakesNoise {
	String name;

	Dog(String name) {
		this.name = name;
	}

	@Override
	public void makeNoise() {
		System.out.println(this.name + " Woof Woof");
	}
}

public class Interfaces {
	static void drive(Drivable thing) {
		thing.start();
		thing.stop();
		if (thing instanceof Car) {
			// Downcasting
			Car theActualCar = (Car)thing;
			System.out.println("The car that you drove is " + theActualCar.color);
		}
	}

	static void makeNoise(MakesNoise thing) {
		thing.makeNoise();
	}

	public static void main(String[] args) {
		Car car = new Car("Green");
		Bicycle bike = new Bicycle(20);
		Dog dog = new Dog("Lucky Snow");

		drive((Drivable)car); // upcasting
		drive(bike);
		makeNoise(car);
		makeNoise(dog);
	}
}
