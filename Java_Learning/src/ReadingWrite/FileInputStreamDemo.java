package ReadingWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("Sample4");
	
		FileInputStream fis = new FileInputStream(f);
		int n =fis.read();
		while(n!=-1) {
			System.out.print((char)n);
			n= fis.read();
		}
	}

}
