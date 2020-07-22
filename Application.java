package Tower;

public class Application {

	public static void main(String[] args) {
		Tower towerA;
		towerA = new Tower();
		towerA.name = "Tower-A";
		towerA.draw();
		
		//Private= Hides the Details

		Tower towerB;
		towerB = new Tower();
		towerB.name = "Tower-B";
		towerB.draw();

		Tower towerC;
		towerC = new Tower();
		towerC.name = "Tower-C";
		towerC.draw();

	}

}
