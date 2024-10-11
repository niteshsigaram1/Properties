package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDifferentObjectTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> a = new ArrayList<>();
		a.add(1);
		a.add('c');
		a.add("abcd");
		a.add(133344);
		a.add("Nitesh Sigaram");
		for(Object b :a) {
			System.out.println(b); 
		}
		
		
	}

}
