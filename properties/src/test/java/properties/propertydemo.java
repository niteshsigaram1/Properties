package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertydemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		File f = new File("D:\\Learning\\properties\\projectdata.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("firstname"));
		System.out.println(prop.getProperty("lastname"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("telephone"));
		System.out.println(prop.getProperty("location"));
		System.out.println(prop.getProperty("experience"));
	}

}
