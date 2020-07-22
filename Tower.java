package Tower;

public class Tower {
	public String name;

	void draw() {
		drawPole();
		drawBase();
		drawTitle();
	}

	private void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("         |");
		}
	}

	private void drawBase() {
		System.out.println("    ----------");
	}

	private void drawTitle() {

		System.out.println("      " + name);
	}
}