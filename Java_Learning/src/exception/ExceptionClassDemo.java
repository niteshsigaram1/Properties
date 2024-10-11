package exception;

public class ExceptionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("abcd");
		}
	}

}
