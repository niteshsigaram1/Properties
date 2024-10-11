package exception;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Age  : ");
		int Age = sc.nextInt();
		try {
		if(Age<18) {
			throw new Exception("Not Eligible");
			}
		else {
			System.out.println("Eligible");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("Scanner is closed");
			
		}
		
		
	}
}
