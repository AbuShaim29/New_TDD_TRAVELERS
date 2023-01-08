 package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private	Properties properties;
	
	   public String getProperty(String key) {
		   return properties.getProperty(key);
		   
	   }
		public  Configuration () {
			loadProperty();
		}
		
		public void loadProperty() {
			properties = new Properties();
			try {
				properties.load(getClass().getClassLoader().getResourceAsStream("Config.properties"));
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	/*Unit test:
		public static void main(String[] args) {
			Configuration configuration = new Configuration();
	        configuration.loadProperty();
			System.err.println(configuration.getProperties().get("url"));
		}
	*/

}
