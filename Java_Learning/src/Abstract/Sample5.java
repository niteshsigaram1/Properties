package Abstract;

public class Sample5 extends Sample6 {


		

			@Override
			public void method4() {
				// TODO Auto-generated method stub
				System.out.println("method4");
			}
			public void methodone() {
				// TODO Auto-generated method stub
				System.out.println("methodone");
			}
			public static void main(String[] args) {
				Sample5 s = new Sample5();
				s.methodone();
				s.method3();
				s.method2();
				s.method4();
			}
		

	}

