package method;

public class CodeReusability2 {
	
	public static void add(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	public static void sub(int a , int b) {
		int c = a-b;
		System.out.println(c);
	}
	public static void mul(int a , int b) {
		int c = a*b;
		System.out.println(c);
	}
	public static void div(int a , int b) {
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    add(5,10);
    sub(5,10);
    mul(5,10);
    div(5,10);
	}

}
