package modifiers;

public class Private {
	
	private int a =10;
	
	private void test() {
		System.out.println("test");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Private p = new Private();
		System.out.println(p.a);
		p.test();
	}

}
