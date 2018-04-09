package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@SuppressWarnings("rawtypes")
public class LogHelper {
	
	private static boolean root = false;

	public static Logger getLogger(Class clas){
		if (root) {
			return Logger.getLogger(clas);
		}
		PropertyConfigurator.configure("C://Users//Rashmi//eclipse-workspace//gtms//src//test//resources//InputData//log4j.properties");
		root = true;
		return Logger.getLogger(clas);
	}

}
