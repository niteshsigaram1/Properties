package ReadingWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("Sample4");
				if(!f.exists())
				{
					f.createNewFile();
				}
				FileOutputStream fos = new FileOutputStream(f);
				fos.write("Java is a \n programming language".getBytes());
				

}
}