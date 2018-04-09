package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	WebDriver driver;
	
	private By menuDressesLink	= By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/a");
	private By lstDressesMenu	= By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/ul");
	private By lnkSignIn		= By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	private By brdAuthntication = By.xpath("//span[@class='navigation_page']");
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement pgObjDressesMenuLink() {
		return driver.findElement(menuDressesLink);
	}
	
	public List<String> pgObjDressesMenuList() {
		
		List<String> lstStr = new ArrayList<String>();
		WebElement eleDress = driver.findElement(lstDressesMenu);
		List<WebElement> lstEle = eleDress.findElements(By.tagName("li"));
		for(WebElement eleDrs: lstEle) {
			lstStr.add(eleDrs.getText());
		}
		return lstStr;
	}
	
	public WebElement pgObjSingInLink() {
		return driver.findElement(lnkSignIn);
	}
	
	public WebElement pgObjAuthenticationBreadCrumb() {
		return driver.findElement(brdAuthntication);
	}
}
