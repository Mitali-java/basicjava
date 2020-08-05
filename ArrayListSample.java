package ArrayListSample;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
	    names.add("sai");
	    names.add("ram");
	    names.add("krishna");

	    // looping
	    for(int i=0; i<names.size(); i++){		// size is the method gives number of items
	       System.out.println(names.get(i)) ;	// get will get the name at given index
	    }

	    // we have to use Object here
	    for(Object name: names){
	        System.out.println(name);
	    }
	}

}
