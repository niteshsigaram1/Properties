package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\HP\\Desktop\\SigaramNitesh_QA_Bangalore.pdf");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("End of the program");
		

	}

}
