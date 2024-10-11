package Variable;

public class LocalVariable {

	int a = 5;

	public static void A() {
		int a = 3;
		int b = 4;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
		LocalVariable lv = new LocalVariable();
		System.out.println(lv.a);
	}

}
