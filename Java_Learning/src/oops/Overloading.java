package oops;

public class Overloading {
	
	
	
	public Overloading(){
		System.out.println("constructor Overloading");
	}
	public Overloading(int a) {
		System.out.print("Constructor Overloading"+a);
	}

	public void demo() {
		System.out.println("demo");
	}
	public void demo(int a )
	{
		System.out.println("demo1");
	}
	public void demo(int c , int d) {
		System.out.println("demo2");
	}
}
