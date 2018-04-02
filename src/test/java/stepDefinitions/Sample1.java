package stepDefinitions;

import utilities.ReadPropertiesFile;

public class Sample1 {

	public static void main(String[] args) {
		
		ReadPropertiesFile prop1 = new ReadPropertiesFile();
		System.out.println(prop1.getSiteUrl());
	}

}
