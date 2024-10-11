package ReadingWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("sample");
		f1.createNewFile();
		System.out.println("Created New File");
		
		FileWriter fw = new FileWriter(f1);
		fw.write("Hello \n");
		fw.write("hi \n");
		fw.write("How are you");
		fw.close();
		//fw.flush();
		System.out.println("end of program");
		
		
		

	}

}
