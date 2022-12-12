package librarys;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class utilityclass {
	 public static String getpropertFileData(String keys) throws IOException {
		 FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\mock2\\Blaze.properties");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(keys);
	 return value;
	 }
}

	


