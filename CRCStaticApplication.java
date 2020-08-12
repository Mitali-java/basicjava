package Learn;

public class Application {

	public static void main(String[] args) {

	Student s1 = new Student();
	s1.name = "Mitali";
	Student.schoolName = "Sunset";
	s1.readBook();
	
	Student s2 = new Student();
	s2.name = "Sanika";
	s2.readBook();
	
	Student s3 = new Student();
	s3.name = "Chaudhari";
	s3.readBook();
	
	Student.displaySchoolName();
	
	}

}
