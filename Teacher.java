package SchoolSystem;

public class Teacher {
	String name;
	{
		Teacher teacher;
		teacher = new Teacher();
		teacher.name = "Mrs.Jones";

		teacher.teach();
		teacher.teachASubject("Biology");

	}

	{

	}

	void teach() {
	}

	void teachASubject(String subject) {
		System.out.println(subject);
	}

}