package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(2);
		a.add(3);
		
		Integer b [] = {0,5,5,8,6,32,};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(b));
		for (int bg:b) {
			System.out.println(bg);
		}
		
		
		System.out.println(a.get(0));
		System.out.println(a.get(2));
		
		System.out.println(a);
		
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for(int e : a) {
			System.out.println(e);
		}
		
	}

}
