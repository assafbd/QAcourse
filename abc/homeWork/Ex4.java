package homeWork;

public class Ex4 {

	public static void main(String[] args) {
		int num = 987;
		int hours = num/60;
		//int min = num- (hours*60);
		int min = num%60;
		
		System.out.println("The hours is "+hours+ " and "+min +" minutes");
	}

}
