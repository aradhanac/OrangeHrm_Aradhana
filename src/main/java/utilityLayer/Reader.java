package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader {

   public static String getProperty(String key) throws FileNotFoundException, IOException {
	   
	   Properties prop = new Properties();
	   //FileInputStream fStream = new FileInputStream();
	   
	   prop.load(new FileInputStream("C:\\Users\\akkif\\OneDrive\\Desktop\\Orangehrm\\src\\main\\java\\configurationLayer\\config.properties"));
	   
	        return  prop.getProperty(key);
	   
   }
	
}
