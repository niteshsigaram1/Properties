package filehandling;

import java.io.File;

public class RepresentingFolderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File w = new File("Sample");
		if(!w.exists()) {
			w.mkdir();
			System.out.println("folder created");
		}else
		{
			System.out.println("folder already created");
		}


	}

}
