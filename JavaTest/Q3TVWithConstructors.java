package Package;

public class Q3TVWithConstructors {
	
	class TV {

		private String name;
		private String color;
		private int price;
		private int size;
		private String model;

		TV(int price, int size) {
			this.price = price;
			this.size = size;
			
		}
				
		TV(String model) {
			this.model = model;
		}
		
		TV(String name, String color) {
			this.name = name;
			this.color = color;

		}
	}
}
