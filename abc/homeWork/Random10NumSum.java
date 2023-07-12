package homeWork;

import java.util.Random;

public class Random10NumSum {

	public static void main(String[] args) {
		Random rand = new Random();
		int sum =0;
		for (int i = 1; i < 11; i++) {
			int rand1 =rand.nextInt(100) + 1;
			sum = sum+rand1;
			System.out.println("The "+i+" Number is "+ rand1+" The the total sum is "+sum);
	
		}

	}

}
