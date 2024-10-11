package exception;

public class RuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b=10;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled here");
		}
		
		
	}

}
