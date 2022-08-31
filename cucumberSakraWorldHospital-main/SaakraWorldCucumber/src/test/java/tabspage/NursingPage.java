package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class NursingPage{

	WebDriver driver;
	
	public WebElement btnNursing;
	public WebElement txtTitle;
	
	public NursingPage(WebDriver driver) {
		this.driver = driver;
	}
	public void setWellnessZoneButton() {
		btnNursing = driver.findElement(By.xpath("//a[@class='nav-title']"));
	}
	
	public void setPageElement() {
		txtTitle = BrowserManager.waitFor(By.xpath("//h1"), driver, EPConditions.VISIBLE);
	}
}
