package String;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Nitesh Sigaram";
		System.out.println("Nitesh".equals(str));
		System.out.println(str.length());
		System.out.println(str.substring(7));
		System.out.println(str.substring(6, 8));
		String str1 = "    java     ";
		System.out.println(str1.trim());
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("tesh"));
		System.out.println(str.indexOf("sai"));
		String str2 = "My Name Is Nitesh";
		String []a = str2.split(" ");
		for(String i : a) {
			System.out.println(i);
		}
		
		
	}

}
