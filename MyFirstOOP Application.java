package MyFirstOOP;

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person();
	    person1.age = 16;
	    person1.name = "Mitali";
	       
	    Person person2 = new Person();
	    person2.name = "Sanika";
	    person2.age = 14;

	    System.out.println(person1.name + "'s age is " + person1.age);
	    System.out.println(person2.name + "'s age is " + person2.age);
	}

}
