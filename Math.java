package AddSpecialExample;

public class Math {

	int brainValue; // instance variable

	Math(int beginValue) {
		this.brainValue = beginValue;
	}

	int addSpecial(int number) { // instance method
		// get what was stored from my brain (1) and call my brainValue
		// add number + brainValue --> newNumber (4)
		// update my brainValue with new NUmber (5)
		// return newNewNumber (5)

		int prevStoredValue = this.brainValue;
		int sum = prevStoredValue + number;
		this.brainValue = sum;
		return sum;
	}

	static int add(int x, int y) {
		int sum = x + y;

		return sum;
	}

}
