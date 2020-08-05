package Tower;

import java.util.*;

public class TohGameTower {
	private String name;
	private ArrayList<Disc> discs;
	
	TohGameTower(String name) {
		this.name = name;
		discs = new ArrayList<Disc>();
		
	}

	void addDisc(Disc d) {
		discs.add(d);
	}
	
	void draw() {
		
		//drawing the pole
		drawPole();
		
		// delegate drawing to disc
		for(Disc d : discs) {
			d.draw();
		}
		
		//base comes
		drawBase();
		
		//title
		drawTitle();
	}
	
	Disc removeDisc(){
		Disc topDisc = this.discs.remove(0);
		return topDisc;
	}

	private void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("         |");
		}
	}

	private void drawBase() {
		System.out.println("   ------------");
	}

	private void drawTitle() {

		System.out.println("      " + name);
	}
}