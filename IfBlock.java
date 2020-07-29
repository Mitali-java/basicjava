package IfBlock;

public class IfBlock {

	public static void main(String[] args) {

	int x = 14;
	
		if (x < 2) {
			System.out.println("That's a small number");
		} else if (x < 5) {
			System.out.println("That number seems ok");
		} else if (x < 10) {
			System.out.println("That number is big");
		} else {
			System.out.println("I wonder what the number could be?");
	
		}
	}
}