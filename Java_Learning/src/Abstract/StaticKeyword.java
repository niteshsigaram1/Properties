package Abstract;

public class StaticKeyword {
	
	int a =5;
	static int b= 6;

	public static void m1() {
		System.out.println(b);
		StaticKeyword sk = new StaticKeyword();
		System.out.println(sk.a);
		sk.m2();
	}
	public void m2() {
		System.out.println(a);
		System.out.println(b);
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(b);
		m1();
		StaticKeyword sk1 = new StaticKeyword();
		sk1.m2();
	}

}
