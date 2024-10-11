package filehandling;

import java.io.File;

public class filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\HP\\Desktop\\sample.txt");
		System.out.println(file.exists());
	 
		File file1 = new File("C:\\Users\\HP\\Desktop\\sample.txt");
		System.out.println(file1.exists());
		
		File file2 = new File("D:\\Learning\\Java_Learning\\src\\sa.txt");
	    boolean b = file2.exists();
	    System.out.println(b);
	    
	    File f1 = new File("D:\\Learning\\Java_Learning\\src\\sa.txt");
	    boolean c = f1.exists();
	    System.out.println(c);
	    
	    File f2 = new File("src/file/Nitesh.txt");
	    boolean d = f2.exists();
	    System.out.println(d);
	    
	    File f3 = new File(System.getProperty("user.dir")+"//src\\file\\Nitesh.txt");
	    boolean e = f3.exists();
	    System.out.println(e);
	
	}
	

}
