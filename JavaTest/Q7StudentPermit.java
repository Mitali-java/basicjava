package Package;

public class Q7StudentPermit {

	public static void main(String[] args) throws Exception {
		
	Student Sanika = new Student(12);
	
	try {
			Sanika.getPermit();
		} 
	
	catch (java.util.InputMismatchException e) {
			System.out.println("You cannot get a permit");
		}
		
	}

}

