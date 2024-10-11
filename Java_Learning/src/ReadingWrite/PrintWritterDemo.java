package ReadingWrite;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("sample3");
		f.createNewFile();
		System.out.print("reader");
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("My name is nitesh ");
		pw.println("Hello");
		pw.close();
		
	}

}
