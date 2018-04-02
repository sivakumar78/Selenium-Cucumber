package utilities;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
	
	Properties prop = null;
	
	public ReadPropertiesFile() {
		
		File fle = new File("C:\\Users\\Rashmi\\eclipse-workspace\\gtms\\src\\test\\resources\\InputData\\inputData.properties");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fle);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			prop = new Properties();
			prop.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getSiteUrl() {
		return prop.getProperty("siteUrl");
	}
	
	public String getBrowserObject() {
		return prop.getProperty("browserType");
	}

}
