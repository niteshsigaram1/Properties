package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Value of A : ");
		int a = sc.nextInt();
		System.out.println(" Enter the Value of B : ");
		int b = sc.nextInt();
		int c =a/b;
		System.out.println(c);
		}
	catch(InputMismatchException e) {
		System.out.println("Input mismatch exception");
	}
		catch(ArithmeticException e ) {
			System.out.println(" Arithmatic Exception");
	
		}

}}
