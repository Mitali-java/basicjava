package Package;

import java.util.ArrayList;

public class Q4Car {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		Car tesla = new Car("Tesla", "T3", true);
		cars.add(tesla);

		Car mercedes = new Car("Mercedes", "M4", false);
		cars.add(mercedes);

		Car toyota = new Car("Toyota", "K8", true);
		cars.add(toyota);

		// looping
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).display();
		}

	}

}

class Car {

	private boolean electric;
	private String make;
	private String model;

	Car(String make, String model, boolean electric) {
		this.make = make;
		this.model = model;
		this.electric = electric;
	}

	void start() {

	}

	void display() {
		System.out.println("This car is made by " + make + " The model of this car is " + model
				+ "and this car drives on " + electric);
	}
}
