package AddSpecialExample;

public class Application {

	public static void main(String[] args) {

		Math mathA = new Math(1);
		Math mathB = new Math(2);
		Math mathC = new Math(3);

		int value = mathA.addSpecial(4);
		System.out.println("From mathA: " + value); // supposed to come as 5 (1+4)

		value = mathB.addSpecial(4);
		System.out.println("From mathB: " + value); // supposed to come as 6 (2+4)

		value = mathA.addSpecial(7); // supposed to come as 12 (5+7)
		System.out.println("From mathA: " + value);

		value = mathB.addSpecial(7); // supposed to come as 13 (6+7)
		System.out.println("From mathB: " + value);

		value = mathC.addSpecial(7); // supposed to come as 10 (3+7)
		System.out.println("From mathC: " + value);

		value = mathC.addSpecial(8); // supposed to come as 18 (10+8)
		System.out.println("From mathC: " + value);

	}

}
