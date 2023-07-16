package classAndObjects_carExample;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("****** For loop ******");
		for (int i = 1; i < 101; i++) {
			Car c = new Car();
			System.out.println("Car located in array " +i+  " "+ c);

		}

		System.out.println("");
		System.out.println("");

		System.out.println("****** While loop ******");
		int j = 1;
		while ( j < 101 ) {
			Car c1 = new Car("Pink",80,true);
			System.out.println("Car located in array " +j+  " "+ c1);
			j++;
		}
	}

}
