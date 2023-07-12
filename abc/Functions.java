
public class Functions {

	public static void main(String[] args) {

		System.out.println("This is inside the Main, **Not in the Function**");
		myMethod();
		myMethod2();
		myMethod();
	}
	
	  static void myMethod() {
		    System.out.println("I just got executed!");
			System.out.println("**This is inside the Function**");

		  }
	  
	  static void myMethod2() {
		    System.out.println("I just got executed!");
			System.out.println("**This is inside the Function 2222**");

		  }

}
