package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.ReadPropertiesFile;

public class HomePage {
	
	String expPageTitle = "My Store";
	WebDriver driver;
	ReadPropertiesFile prop;
	
	@Given("^the user navigates to the YourLogo site$")
	public void the_user_navigates_to_the_YourLogo_site() throws Throwable {
		//Added as part of GitHub commit!!
		String drvChromePath = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", drvChromePath);
		driver = new ChromeDriver();
		prop = new ReadPropertiesFile();
	    driver.get(prop.getSiteUrl());
	}
	
	@Then("^the page title displays as My Store$")
	public void the_page_title_displays_as_My_Store() throws Throwable {
	    Assert.assertTrue("Title is not matching", driver.getTitle().equalsIgnoreCase(expPageTitle));
	}

	@When("^the user selects the Dresses menu item$")
	public void the_user_selects_the_Dresses_menu_item() throws Throwable {
	    System.out.println("Working!!");
	}

	@Then("^the available menu items displays$")
	public void the_available_menu_items_displays() throws Throwable {
		System.out.println("Working!!");
	    driver.quit();
	}
	
	@When("^the user selects the Sign In link$")
	public void the_user_selects_the_Sign_In_link() throws Throwable {
		System.out.println("Working!!");
	}

	@Then("^the Authentication page displays$")
	public void the_Authentication_page_displays() throws Throwable {
		System.out.println("Working!!");
		driver.quit();
	}

}
