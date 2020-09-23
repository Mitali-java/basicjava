package Package;

public class Q8JDK {

	public static void main(String[] args) {

		// JDK method
		double result = java.lang.Math.sqrt(4.0);
		System.out.println(result);

		result = java.lang.Math.floor(3.2);
		System.out.println(result);

		result = java.lang.Math.ceil(3.2);
		System.out.println(result);

		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());
	}

	public int simpleAdd(int x, int y) {
		return x + y;

	}
}
