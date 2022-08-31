package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class WellnessZonePage{

	WebDriver driver;
	
	public WebElement btnWellnessZone;
	public WebElement txtIPServices;
	public WebElement btnHealthChkUp;
	
	public WellnessZonePage(WebDriver driver) {
		this.driver = driver;
	}
	public void setWellnessZoneButton() {
		btnWellnessZone = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.wellness-zone"));
	}
	
	public void setPageElement() {
		txtIPServices = driver.findElement(By.xpath("(//div//h1)[2]"));
	}
	
	public void setWellnesszoneOptions() {
		btnHealthChkUp = BrowserManager.waitFor(By.xpath("(//a[@class='dropdown-toggle nav-title wellness-zone']//parent::li//li)[2]"), driver, EPConditions.CLICKABLE);
	}
}
