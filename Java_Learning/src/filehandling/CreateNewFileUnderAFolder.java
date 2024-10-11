package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFileUnderAFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("Sample/sample.txt");
		f.createNewFile();
		System.out.println("file created");
		
		File folder = new File("Sample");
		File f1 = new File(folder,"s2");
		f1.createNewFile();
		System.out.println("endofthisprogram");
		
	}

}
