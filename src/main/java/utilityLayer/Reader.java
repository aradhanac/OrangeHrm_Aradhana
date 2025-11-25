package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader {

   public static String getProperty(String key) throws FileNotFoundException, IOException {
	   
	   Properties prop = new Properties();
	   //FileInputStream fStream = new FileInputStream();
	   
	   prop.load(new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\Orange_Ashwini\\OrangeHrm_Aradhana\\src\\main\\java\\configurationLayer\\config.properties"));
	   
	        return  prop.getProperty(key);
	   
   }
	
}
