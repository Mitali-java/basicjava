package ArrayGenericListSample;

import java.util.ArrayList;

public class ArrayGenericListSample {

	public static void main(String[] args) {
	    ArrayList<String> names = new ArrayList<String>();
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    
		    names.add("sai");
		    names.add("ram");
		    names.add("krishna");

		    // getting all the names
		    for(int i=0; i<names.size(); i++) {
		    	System.out.println(names.get(i));
		    }

		    // getting all the numbers
		    for(Integer number : numbers) {
		    	System.out.println(number);
		    }
		    
		    numbers.add(10);  
		    
		    for(int i=0; i<numbers.size(); i++) {
		    	System.out.println(numbers.get(i));
		    }

		    // getting all the numbers
		    for(Integer number : numbers) {
		    	System.out.println(number);
		    }
		    
	}

}
