package oops;

public class Inheritance2Sounds extends Inheritance {
	
	public Inheritance2Sounds() {
		super(7);
		System.out.println("Sound1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Inheritance2Sounds it2 = new Inheritance2Sounds();
		it2.Cat();
		//it2.cow();
		it2.dog();
		
		System.out.println(it2.name);
		System.out.println(it2.i);
		

	}

}
