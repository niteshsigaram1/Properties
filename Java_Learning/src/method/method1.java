package method;

public class method1 {

	public void method1() {
		System.out.println("a method");
	}

	public void method2() {
		System.out.println("b method");
	}

	public void method3() {
		System.out.println("c method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
		method1 m = new method1();
		m.method1();
		m.method2();
		m.method3();
		System.out.println("end");
	}

}
