package ReadingWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("Sample2");
		if(!f.exists()) {
		f.createNewFile();
		System.out.println("file Created");
		}else {
		System.out.println("File not created");
		}
		FileWriter f1 = new FileWriter(f);
	BufferedWriter  wb = new BufferedWriter(f1);
	wb.write("Hi");
	wb.newLine();
	wb.write("hello");
	wb.close();
	System.out.println("Written");

	}

}
