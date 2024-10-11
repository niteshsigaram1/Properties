package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> v = new HashSet<>(Arrays.asList(new Integer[] {0,9,8,7,6,5,4,3,2}));
		System.out.println(v);
		s.add(5);
		s.add(17);
		s.add(18);
		s.add(27);
		s.add(18);
		System.out.println(s);
		for(Integer a :s) {
			System.out.println(a);
		}
		
	}

}
