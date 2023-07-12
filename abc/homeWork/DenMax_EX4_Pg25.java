package homeWork;

public class DenMax_EX4_Pg25 {

	public static void main(String[] args) {
		int den = 3;
		int max = 31;
		if (max > 0 && den > 0 && max > den) {
			for (int i = 1; i < max + 1; i++) {
				if (i % den == 0) {
					System.out.println("The number " + i + " is devide with no extras");
				}
			}
		} else {
			System.out.println(
					"Max or den should be larger than 0 and Max should be bigger then den , please change this and run again");
		}

		
	}

}
