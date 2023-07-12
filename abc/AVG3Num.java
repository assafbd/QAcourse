import java.util.Scanner;

public class AVG3Num {
	public static void main(String[] args) {


		int num1 = 5;

		int num2 = 8;
		
		int num3 = 9;

		int sum;
		int avg;
		float mod;

		sum = num1 + num2 +num3;
		System.out.println("The Sum is: "+sum);
		
		System.out.println("The Average is: " +   (avg =sum/3) );
		
		System.out.println("The Mod is: " +   (mod =sum%3) );

	}
}
