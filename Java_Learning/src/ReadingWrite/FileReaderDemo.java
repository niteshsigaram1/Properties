package ReadingWrite;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("D:\\Learning\\Java_Learning\\sample3");
	int n = (char)fr.read();

	
	while(n!=-1)
	{
		System.out.print((char)n);
		 n=fr.read();
	}
	}

}
