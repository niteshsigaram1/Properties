package filehandling;

import java.io.File;

public class ideletedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\Learning\\Java_Learning\\Sample");
		f.delete();
		System.out.println("folder deleted");
		
		File s = new File("D:\\Learning\\Java_Learning\\src\\sa.txt");
		s.delete();
		System.out.println("file deleted");
		
		

	}

}
