package Package;

public class Q6StaticMethodsMath {

	public static void main(String[] args) {
		System.out.println(Math.multiply(2, 3, 4));
	}
}

class Math {
	static int multiply(int a, int b, int c){
		int d;
		d= (a+b)*c;
		return d;
	}
}