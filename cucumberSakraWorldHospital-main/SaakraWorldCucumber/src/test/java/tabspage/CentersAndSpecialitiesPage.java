package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class CentersAndSpecialitiesPage {
	WebDriver driver;
	
	public WebElement txtBanner;
		
	public CentersAndSpecialitiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setCentreAndSpecElements() {
		txtBanner = BrowserManager.waitFor(By.xpath("(//div//h2)[2]"), driver, EPConditions.VISIBLE);
	}

}
