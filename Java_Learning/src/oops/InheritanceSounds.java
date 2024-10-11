package oops;

public class InheritanceSounds extends Inheritance {
	
	public void cow() {
		System.out.println("amba");
	}
	public InheritanceSounds() {
		super(8);
		System.out.println("Sound1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		InheritanceSounds sd = new InheritanceSounds();
		System.out.println(sd.name);
		System.out.println(sd.i);
		sd.Cat();
		sd.dog();
	}

}
