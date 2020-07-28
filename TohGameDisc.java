package Tower;

public class Disc {

	private int size;

	Disc(int size) {
		this.size = size;
	}

	public void draw() {
		for (int i = 0; i < this.size; i++) {
			System.out.print("-");
		}
			System.out.println("");
	}
}
