package method;

public class MethodReturningData {

	public static void a() {
		System.out.println("a");
	}
	public static void b(int x ,int y) {
		System.out.println(x+y);
	}
	public static int c(int x ,int y) {
		return x+y;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
a();
b(1,2);
int sum = c(3,4);
System.out.println(sum);
System.out.println(c(3,4));
	}

}
