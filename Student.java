package SchoolSystem;

public class Student {
	String name;
	int age;
	{
		Student studentA;
		Student studentB;

		studentA = new Student();
		studentA.name = "Mitali";
		studentA.age = 14;

		studentB = new Student();
		studentB.name = "Sanika";
		studentB.age = 15;

		studentA.readBook();
		studentB.readABook("The Lunar Chronicles");

	}

	{

	}

	void readBook() {
	}

	void readABook(String bookName) {
		System.out.println(bookName);
	}

}
