package ArraySample;

public class ArraySample {

	public static void main(String[] args) {
		// Declaring names which can hold 3 strings
		String[] names = new String[3];
		names[0] = "sai"; // first one is at 0
		names[1] = "ram"; // second one is at 1
		names[2] = "krishna"; // third one is at 2

		// Printing all the names in array
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i]);
		}

		// Another way of looping is
		for (String name : names) {
			System.out.println(name);
		}

		// Holding integer values
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;

		// Looping is same
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int number : numbers) {
			System.out.println(number);
		}
	}
}