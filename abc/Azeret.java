import java.util.Scanner;

public class Azeret {

	public static void main(String[] args) {
		//Azeret - Factorial
		// Int Number
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to Azeret - Factorial: ");
        int num = scanner.nextInt();
        
		int azeret=1;
		 while (num > 1) {
		    	System.out.println(azeret + " * "+ num+" = "+ azeret*num);
		        azeret = azeret*num;
		        num--;
		    	System.out.println("total " + azeret +" Inside the loop");
		    	System.out.println("**********************************");

		    }
	System.out.println(azeret);
	scanner.close();
	}

}
