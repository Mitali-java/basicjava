package Learn;

public class Student {
	
	//instance variable
	String name;
	
	//class variable
	static String schoolName;
	
	//instance method
	public void readBook() {
		System.out.println("Reading by: " + this.name);
		System.out.println("My school name is: " + schoolName);
	}
	
	//class method
	public static void displaySchoolName() {
		System.out.println("school name is: " + schoolName);
		//System.out.println("name is:" + name);
	}
}
