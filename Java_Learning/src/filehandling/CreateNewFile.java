package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("sai1");
		if(!f.exists()) {
			f.createNewFile();	
			System.out.println("file created");
		}
		else {
			System.out.println("file already exist");
		}
		
		System.out.println("End of this program");
	}

}
