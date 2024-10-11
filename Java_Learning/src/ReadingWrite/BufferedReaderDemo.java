package ReadingWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("Sample2");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str  = br.readLine();
		
		while(str!=null){
			System.out.println(str);
			str = br.readLine();
			
			
		}
		

	}

}
