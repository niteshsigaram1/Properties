package filehandling;

import java.io.File;

public class IsFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("Sample");
		System.out.println(f1.isFile());
		
		File f2 = new File("src/file/Nitesh.txt");
		System.out.println(f2.isFile());

	}

}
