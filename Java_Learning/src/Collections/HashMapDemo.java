package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Object> h = new HashMap();
h.put("name", "Nitesh");
h.put("Experience", 70);
h.put("Location", "Bangalore");
h.put("Working", "No");
System.out.println(h);
System.out.println(h.get("Location"));

	for(String a : h.keySet()) {
		
		System.out.println(a+":"+h.get(a));
		
}
}
}