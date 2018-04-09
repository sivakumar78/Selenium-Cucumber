package genericfunctions;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageobjects.HomePageObjects;
import utilities.LogHelper;
import utilities.TestBase;

public class HomePageFunctions {
	
	WebDriver driver;
	Actions action = new Actions(TestBase.driver);
	HomePageObjects hpo = new HomePageObjects(TestBase.driver);
	private final Logger log = LogHelper.getLogger(TestBase.class);
	String expDressItems = "CASUAL DRESSES;SUMMER DRESSES;EVENING DRESSES";
	String expBrdCrmbAuth = "Authentication";
	
	public HomePageFunctions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void mouseOverDressesMenuLink() {
		action.moveToElement(hpo.pgObjDressesMenuLink()).build().perform();
	}
	
	public void vfyDressesMenuItems() {
		List<String> lstActItms = hpo.pgObjDressesMenuList();
		String[] lstExpItms = expDressItems.split(";");
		
		for(String expDrs : lstExpItms) {
			boolean res = lstActItms.contains(expDrs.trim());
			if (res) {
				log.info(expDrs + " expected matches the actual");
			}else {
				log.info(expDrs + " expected did not match the actual");
			}
		}
	}
	
	public void clkSignInLink() {
		hpo.pgObjSingInLink().click();
		log.info("SignIn link is clicked from home page");
	}
	
	public void vrfyBrdCrmbAuthemtication() {
		String actText = hpo.pgObjAuthenticationBreadCrumb().getText();
		Assert.assertTrue("Bred Crumb Authentication is not matching", expBrdCrmbAuth.equalsIgnoreCase(actText));
		log.info(expBrdCrmbAuth + " expected breadcrumb Authentication title and actual title is " + actText);
	}
}
