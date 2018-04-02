package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	ReadPropertiesFile prop = new ReadPropertiesFile();
	
	public WebDriver getBrowserType() throws Exception {
		
		String browType = prop.getBrowserObject();
		
		if(browType.equalsIgnoreCase("Chrome")) {
			String drvChromePath = "C:\\Selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", drvChromePath);
			driver = new ChromeDriver();
			return driver;
		}else if (browType.equalsIgnoreCase("IE")) {
			String drvIEPath = "C:\\Selenium\\IEDriverServer.exe";
			System.setProperty("webdriver.IExplore.driver", drvIEPath);
			driver = new ChromeDriver();
			return driver;
		}else {
			System.out.println("No matching browser type found");
		}
		return null;
	}
	
	//@Before
	public void before() throws Exception {
		driver = getBrowserType();
		driver.manage().window().maximize();
	}
	
	//@After
	public void after() throws Exception {
		driver.quit();
	}

}
