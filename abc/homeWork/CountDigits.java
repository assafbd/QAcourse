package homeWork;

public class CountDigits {

	public static void main(String[] args) {
		int num = 9854;
		int number = num;
		int count = 0; //Count will count the digits in the (num)number
		while (num>1) {
			num=num/10;
			count++;
			if (count==2) {
				System.out.println("����� �2 ����� :) �������");
			}else {
				System.out.println("��� �� ������ �����");
			}
		}
		System.out.println("The input number is- "+ number + " The number of digits is - "+count);
	}

}
